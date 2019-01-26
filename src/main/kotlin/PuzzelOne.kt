import io.reactivex.subjects.BehaviorSubject

class PuzzelOne {
    fun call() {
        val subject = BehaviorSubject.create<Boolean>()
    }
}