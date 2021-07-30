package com.reactnativegooglepayimage

import android.view.LayoutInflater
import android.view.View
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class DonateWithGooglePayImageViewManager : SimpleViewManager<View>() {
  override fun getName() = "DonateWithGooglePayImageView"

  override fun createViewInstance(reactContext: ThemedReactContext): View {
    return LayoutInflater.from(reactContext).inflate(
      R.layout.donate_with_googlepay_button, null
    )
  }
}
