import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject

class PuzzleOne {
    fun call() {
        printCurrentThread("main thread name")

        val subject = BehaviorSubject.createDefault(Unit)
        subject.subscribeOn(Schedulers.computation()).subscribe { printCurrentThread("subscribe onNext") }

        Thread.sleep(100L)
        subject.onNext(Unit)
        Thread.sleep(100L)
    }
}