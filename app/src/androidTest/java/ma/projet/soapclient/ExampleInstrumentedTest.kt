package ma.projet.soapclient

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Suite de tests instrumentés, à exécuter sur un appareil physique ou un émulateur Android.
 *
 * Consultez la documentation officielle pour plus d'informations sur les tests (http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
    // Contexte de l'application sous test récupéré via l'instrumentation.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("ma.projet.soapclient", appContext.packageName)
    }
}