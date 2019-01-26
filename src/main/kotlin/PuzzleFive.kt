import io.reactivex.Observable
import io.reactivex.Observable.just
import io.reactivex.functions.BiFunction
import io.reactivex.schedulers.Schedulers.computation
import io.reactivex.schedulers.Schedulers.io

class PuzzleFive {
    fun call() {
        printCurrentThread("main thread name")

        Observable.combineLatest(
            just(Unit).observeOn(io()),
            just(Unit).observeOn(computation()),
            BiFunction<Unit, Unit, Unit> { _, _ -> Unit }
        ).subscribe { printCurrentThread("subscriber onNext") }

        Thread.sleep(100L)
    }
}