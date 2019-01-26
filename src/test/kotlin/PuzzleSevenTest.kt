import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PuzzleSevenTest {
    @Test
    fun `call will work`() {
        /*
        A. main thread name: main
           subscribe onNext 1: RxComputationScheduler
           subscribe onNext 2: RxComputationScheduler

        B. main thread name: main
           subscribe onNext 2: main
           subscribe onNext 1: RxComputationScheduler

        C. Either of the above

        E. None of the above, something else crazy
         */
        PuzzleSeven().call()
    }
}