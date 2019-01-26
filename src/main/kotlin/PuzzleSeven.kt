import io.reactivex.Observable.just
import io.reactivex.schedulers.Schedulers.computation

class PuzzleSeven {
    fun call() {
        printCurrentThread("main thread name")

        val connectable = just(Unit).replay().refCount()

        connectable.subscribeOn(computation()).subscribe { printCurrentThread("subscribe onNext 1") }
        connectable.subscribe { printCurrentThread("subscribe onNext 2") }

        Thread.sleep(1000L)
    }
}