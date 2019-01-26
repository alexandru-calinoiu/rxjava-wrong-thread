import io.reactivex.Completable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject

class PuzzleTwo {
    fun call() {
        printCurrentThread("main thread name")

        val subject = BehaviorSubject.createDefault(Unit)

        subject.subscribeOn(Schedulers.computation()).subscribe { printCurrentThread("subscribe onNext") }

        Thread.sleep(100L)
        Completable.complete().subscribeOn(Schedulers.io()).subscribe { subject.onNext(Unit) }
        Thread.sleep(100L)
    }
}