/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<0bafb0a2fb79c4220d21f1736894af14>>
 */

/**
 * IMPORTANT: Do NOT modify this file directly.
 *
 * To change the definition of the flags, edit
 *   packages/react-native/scripts/featureflags/ReactNativeFeatureFlags.config.js.
 *
 * To regenerate this code, run the following script from the repo root:
 *   yarn featureflags --update
 */

package com.facebook.react.internal.featureflags

public open class ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android : ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android() {
  // We could use JNI to get the defaults from C++,
  // but that is more expensive than just duplicating the defaults here.

  override fun preventShadowTreeCommitExhaustion(): Boolean = true

  override fun useNativeEqualsInNativeReadableArrayAndroid(): Boolean = true

  override fun useNativeTransformHelperAndroid(): Boolean = true
}
