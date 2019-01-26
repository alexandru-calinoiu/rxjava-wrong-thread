import io.reactivex.Observable
import io.reactivex.Observable.just
import io.reactivex.functions.BiFunction
import io.reactivex.schedulers.Schedulers.computation
import io.reactivex.schedulers.Schedulers.io

class PuzzleSix {
    fun call() {
        printCurrentThread("main thread name")

        Observable.combineLatest(
            just(Unit).subscribeOn(io()),
            just(Unit).subscribeOn(computation()),
            BiFunction<Unit, Unit, Unit> { _, _ -> Unit }
        ).subscribe { printCurrentThread("subscriber onNext") }

        Thread.sleep(100L)
    }
}