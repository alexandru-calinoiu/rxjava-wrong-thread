import io.reactivex.Observable
import io.reactivex.Observable.just
import io.reactivex.schedulers.Schedulers.computation
import io.reactivex.subjects.BehaviorSubject

class PuzzleFour {
    fun call() {
        printCurrentThread("main thread name")

        val subject = BehaviorSubject.createDefault(Unit)

        Observable.merge(
            just(Unit),
            subject
        ).subscribeOn(computation()).subscribe { printCurrentThread("subscribe onNext") }

        Thread.sleep(100L)
        subject.onNext(Unit)
        Thread.sleep(100L)
    }
}