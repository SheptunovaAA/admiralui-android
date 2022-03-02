package com.admiral.demo

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.karumi.shot.ScreenshotTest
import com.admiral.demo.app.AppActivity
import com.admiral.demo.app.AppActivity.Companion.KEY_IS_TEST
import com.admiral.demo.ext.BetterScrollTo
import org.junit.Rule
import org.junit.Test

class InformersTest : ScreenshotTest {

    @get:Rule
    var activityRule: IntentsTestRule<AppActivity> = IntentsTestRule(AppActivity::class.java, true, false)

    @Test
    fun checkInformersBig() {
        val intent = Intent().apply {
            putExtra(KEY_IS_TEST, true)
        }
        val activity = activityRule.launchActivity(intent)

        onView(withId(R.id.mainMenuHome)).perform(ViewActions.click())
        onView(withId(R.id.informerButton)).perform(BetterScrollTo(), ViewActions.click())
        onView(withId(R.id.btnInformers)).perform(ViewActions.click())
        onView(withId(R.id.btnInformersSmall)).perform(ViewActions.click())

        compareScreenshot(activity)
    }

    @Test
    fun checkInformersBigDisabled() {
        val intent = Intent().apply {
            putExtra(KEY_IS_TEST, true)
        }
        val activity = activityRule.launchActivity(intent)

        onView(withId(R.id.mainMenuHome)).perform(ViewActions.click())
        onView(withId(R.id.informerButton)).perform(BetterScrollTo(), ViewActions.click())
        onView(withId(R.id.btnInformers)).perform(ViewActions.click())
        onView(withId(R.id.btnInformersSmall)).perform(ViewActions.click())
        onView(withId(R.id.disabledTab)).perform(ViewActions.click())

        compareScreenshot(activity)
    }

    @Test
    fun checkInformersSmall() {
        val intent = Intent().apply {
            putExtra(KEY_IS_TEST, true)
        }
        val activity = activityRule.launchActivity(intent)

        onView(withId(R.id.mainMenuHome)).perform(ViewActions.click())
        onView(withId(R.id.informerButton)).perform(BetterScrollTo(), ViewActions.click())
        onView(withId(R.id.btnInformers)).perform(ViewActions.click())
        onView(withId(R.id.btnInformersBig)).perform(ViewActions.click())

        compareScreenshot(activity)
    }

    @Test
    fun checkInformersSmallDisabled() {
        val intent = Intent().apply {
            putExtra(KEY_IS_TEST, true)
        }
        val activity = activityRule.launchActivity(intent)

        onView(withId(R.id.mainMenuHome)).perform(ViewActions.click())
        onView(withId(R.id.informerButton)).perform(BetterScrollTo(), ViewActions.click())
        onView(withId(R.id.btnInformers)).perform(ViewActions.click())
        onView(withId(R.id.btnInformersBig)).perform(ViewActions.click())
        onView(withId(R.id.disabledTab)).perform(ViewActions.click())

        compareScreenshot(activity)
    }
}