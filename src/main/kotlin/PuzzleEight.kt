import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers.computation
import io.reactivex.schedulers.Schedulers.newThread

class PuzzleEight {
    fun call() {
        printCurrentThread("main thread name")

        val connectable = Observable.just(Unit).replay().refCount()

        connectable.subscribeOn(newThread()).subscribe { printCurrentThread("subscribe onNext 1") }
        connectable.subscribeOn(computation()).subscribe { printCurrentThread("subscribe onNext 2") }
        connectable.subscribe { printCurrentThread("subscribe onNext 3") }

        Thread.sleep(1000L)
    }
}