import io.reactivex.Observable
import io.reactivex.Observable.just
import io.reactivex.schedulers.Schedulers

class PuzzleThree {
    fun call() {
        printCurrentThread("main thread name")

        Observable.merge(
            just(Unit).subscribeOn(Schedulers.computation()),
            just(Unit).subscribeOn(Schedulers.io())
        ).subscribe { printCurrentThread("subscribe onNext") }

        Thread.sleep(100L)
    }
}