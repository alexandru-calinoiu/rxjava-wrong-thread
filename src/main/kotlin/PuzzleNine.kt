import io.reactivex.schedulers.Schedulers.io
import io.reactivex.subjects.BehaviorSubject

class PuzzleNine {
    fun call() {
        printCurrentThread("main thread name")

        val subject = BehaviorSubject.createDefault(Unit)
        val connectable = subject.observeOn(io()).replay().refCount()

        connectable.subscribe { printCurrentThread("subscribe onNext 1") }
        connectable.subscribe { printCurrentThread("subscribe onNext 2") }

        Thread.sleep(1000L)
    }
}