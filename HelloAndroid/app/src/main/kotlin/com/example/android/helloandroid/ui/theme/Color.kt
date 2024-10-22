/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.helloandroid.ui.theme

import androidx.compose.ui.graphics.Color

//Start - Partial Color List

//Light Colors
val primaryLight = Color(0xFF00506E)
val primaryContainerLight = Color(0xFF23759B)
val secondaryLight = Color(0xFF486271)
val tertiaryLight = Color(0xFF613A73)


//Dark Colors
val primaryDark = Color(0xFF87CFF9)
val primaryContainerDark = Color(0xFF005C7D)
val secondaryDark = Color(0xFFB0CADC)
val tertiaryDark = Color(0xFFE6B5F8)

//End - Partial Color List




/*

//Full Color List generated by the Google Material Theme Builder
// https://material-foundation.github.io/material-theme-builder/
// Source / Primary Color: 2300668B
// Color Match: true

//Light Colors

val primaryLight = Color(0xFF00506E)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFF23759B)
val onPrimaryContainerLight = Color(0xFFFFFFFF)
val secondaryLight = Color(0xFF486271)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFCFEAFD)
val onSecondaryContainerLight = Color(0xFF344D5C)
val tertiaryLight = Color(0xFF613A73)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFF885E9A)
val onTertiaryContainerLight = Color(0xFFFFFFFF)
val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFFDAD6)
val onErrorContainerLight = Color(0xFF410002)
val backgroundLight = Color(0xFFF7F9FD)
val onBackgroundLight = Color(0xFF191C1F)
val surfaceLight = Color(0xFFF7F9FD)
val onSurfaceLight = Color(0xFF191C1F)
val surfaceVariantLight = Color(0xFFDBE4EB)
val onSurfaceVariantLight = Color(0xFF40484E)
val outlineLight = Color(0xFF70787E)
val outlineVariantLight = Color(0xFFBFC8CF)
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF2D3133)
val inverseOnSurfaceLight = Color(0xFFEFF1F4)
val inversePrimaryLight = Color(0xFF87CFF9)
val surfaceDimLight = Color(0xFFD8DADD)
val surfaceBrightLight = Color(0xFFF7F9FD)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFF2F4F7)
val surfaceContainerLight = Color(0xFFECEEF1)
val surfaceContainerHighLight = Color(0xFFE6E8EC)
val surfaceContainerHighestLight = Color(0xFFE0E3E6)

//Light Colors - Medium Contrast

val primaryLightMediumContrast = Color(0xFF004864)
val onPrimaryLightMediumContrast = Color(0xFFFFFFFF)
val primaryContainerLightMediumContrast = Color(0xFF23759B)
val onPrimaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val secondaryLightMediumContrast = Color(0xFF2D4655)
val onSecondaryLightMediumContrast = Color(0xFFFFFFFF)
val secondaryContainerLightMediumContrast = Color(0xFF5E7888)
val onSecondaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryLightMediumContrast = Color(0xFF5A336C)
val onTertiaryLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightMediumContrast = Color(0xFF885E9A)
val onTertiaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val errorLightMediumContrast = Color(0xFF8C0009)
val onErrorLightMediumContrast = Color(0xFFFFFFFF)
val errorContainerLightMediumContrast = Color(0xFFDA342E)
val onErrorContainerLightMediumContrast = Color(0xFFFFFFFF)
val backgroundLightMediumContrast = Color(0xFFF7F9FD)
val onBackgroundLightMediumContrast = Color(0xFF191C1F)
val surfaceLightMediumContrast = Color(0xFFF7F9FD)
val onSurfaceLightMediumContrast = Color(0xFF191C1F)
val surfaceVariantLightMediumContrast = Color(0xFFDBE4EB)
val onSurfaceVariantLightMediumContrast = Color(0xFF3C444A)
val outlineLightMediumContrast = Color(0xFF586066)
val outlineVariantLightMediumContrast = Color(0xFF737C82)
val scrimLightMediumContrast = Color(0xFF000000)
val inverseSurfaceLightMediumContrast = Color(0xFF2D3133)
val inverseOnSurfaceLightMediumContrast = Color(0xFFEFF1F4)
val inversePrimaryLightMediumContrast = Color(0xFF87CFF9)
val surfaceDimLightMediumContrast = Color(0xFFD8DADD)
val surfaceBrightLightMediumContrast = Color(0xFFF7F9FD)
val surfaceContainerLowestLightMediumContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightMediumContrast = Color(0xFFF2F4F7)
val surfaceContainerLightMediumContrast = Color(0xFFECEEF1)
val surfaceContainerHighLightMediumContrast = Color(0xFFE6E8EC)
val surfaceContainerHighestLightMediumContrast = Color(0xFFE0E3E6)

//Light Colors - High Contrast

val primaryLightHighContrast = Color(0xFF002536)
val onPrimaryLightHighContrast = Color(0xFFFFFFFF)
val primaryContainerLightHighContrast = Color(0xFF004864)
val onPrimaryContainerLightHighContrast = Color(0xFFFFFFFF)
val secondaryLightHighContrast = Color(0xFF082533)
val onSecondaryLightHighContrast = Color(0xFFFFFFFF)
val secondaryContainerLightHighContrast = Color(0xFF2D4655)
val onSecondaryContainerLightHighContrast = Color(0xFFFFFFFF)
val tertiaryLightHighContrast = Color(0xFF361048)
val onTertiaryLightHighContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightHighContrast = Color(0xFF5A336C)
val onTertiaryContainerLightHighContrast = Color(0xFFFFFFFF)
val errorLightHighContrast = Color(0xFF4E0002)
val onErrorLightHighContrast = Color(0xFFFFFFFF)
val errorContainerLightHighContrast = Color(0xFF8C0009)
val onErrorContainerLightHighContrast = Color(0xFFFFFFFF)
val backgroundLightHighContrast = Color(0xFFF7F9FD)
val onBackgroundLightHighContrast = Color(0xFF191C1F)
val surfaceLightHighContrast = Color(0xFFF7F9FD)
val onSurfaceLightHighContrast = Color(0xFF000000)
val surfaceVariantLightHighContrast = Color(0xFFDBE4EB)
val onSurfaceVariantLightHighContrast = Color(0xFF1D252A)
val outlineLightHighContrast = Color(0xFF3C444A)
val outlineVariantLightHighContrast = Color(0xFF3C444A)
val scrimLightHighContrast = Color(0xFF000000)
val inverseSurfaceLightHighContrast = Color(0xFF2D3133)
val inverseOnSurfaceLightHighContrast = Color(0xFFFFFFFF)
val inversePrimaryLightHighContrast = Color(0xFFD9EFFF)
val surfaceDimLightHighContrast = Color(0xFFD8DADD)
val surfaceBrightLightHighContrast = Color(0xFFF7F9FD)
val surfaceContainerLowestLightHighContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightHighContrast = Color(0xFFF2F4F7)
val surfaceContainerLightHighContrast = Color(0xFFECEEF1)
val surfaceContainerHighLightHighContrast = Color(0xFFE6E8EC)
val surfaceContainerHighestLightHighContrast = Color(0xFFE0E3E6)

//Dark Colors

val primaryDark = Color(0xFF87CFF9)
val onPrimaryDark = Color(0xFF00344A)
val primaryContainerDark = Color(0xFF005C7D)
val onPrimaryContainerDark = Color(0xFFF4F9FF)
val secondaryDark = Color(0xFFB0CADC)
val onSecondaryDark = Color(0xFF193342)
val secondaryContainerDark = Color(0xFF294351)
val onSecondaryContainerDark = Color(0xFFBDD8EA)
val tertiaryDark = Color(0xFFE6B5F8)
val onTertiaryDark = Color(0xFF462058)
val tertiaryContainerDark = Color(0xFF6E4680)
val onTertiaryContainerDark = Color(0xFFFFF9FB)
val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val errorContainerDark = Color(0xFF93000A)
val onErrorContainerDark = Color(0xFFFFDAD6)
val backgroundDark = Color(0xFF101416)
val onBackgroundDark = Color(0xFFE0E3E6)
val surfaceDark = Color(0xFF101416)
val onSurfaceDark = Color(0xFFE0E3E6)
val surfaceVariantDark = Color(0xFF40484E)
val onSurfaceVariantDark = Color(0xFFBFC8CF)
val outlineDark = Color(0xFF899298)
val outlineVariantDark = Color(0xFF40484E)
val scrimDark = Color(0xFF000000)
val inverseSurfaceDark = Color(0xFFE0E3E6)
val inverseOnSurfaceDark = Color(0xFF2D3133)
val inversePrimaryDark = Color(0xFF00668A)
val surfaceDimDark = Color(0xFF101416)
val surfaceBrightDark = Color(0xFF363A3C)
val surfaceContainerLowestDark = Color(0xFF0B0F11)
val surfaceContainerLowDark = Color(0xFF191C1F)
val surfaceContainerDark = Color(0xFF1D2023)
val surfaceContainerHighDark = Color(0xFF272A2D)
val surfaceContainerHighestDark = Color(0xFF323538)

//Dark Colors - Medium Contrast

val primaryDarkMediumContrast = Color(0xFF8BD3FD)
val onPrimaryDarkMediumContrast = Color(0xFF001925)
val primaryContainerDarkMediumContrast = Color(0xFF4E99C0)
val onPrimaryContainerDarkMediumContrast = Color(0xFF000000)
val secondaryDarkMediumContrast = Color(0xFFB4CEE1)
val onSecondaryDarkMediumContrast = Color(0xFF001925)
val secondaryContainerDarkMediumContrast = Color(0xFF7A94A5)
val onSecondaryContainerDarkMediumContrast = Color(0xFF000000)
val tertiaryDarkMediumContrast = Color(0xFFEAB9FD)
val onTertiaryDarkMediumContrast = Color(0xFF29013B)
val tertiaryContainerDarkMediumContrast = Color(0xFFAD80BF)
val onTertiaryContainerDarkMediumContrast = Color(0xFF000000)
val errorDarkMediumContrast = Color(0xFFFFBAB1)
val onErrorDarkMediumContrast = Color(0xFF370001)
val errorContainerDarkMediumContrast = Color(0xFFFF5449)
val onErrorContainerDarkMediumContrast = Color(0xFF000000)
val backgroundDarkMediumContrast = Color(0xFF101416)
val onBackgroundDarkMediumContrast = Color(0xFFE0E3E6)
val surfaceDarkMediumContrast = Color(0xFF101416)
val onSurfaceDarkMediumContrast = Color(0xFFF9FBFE)
val surfaceVariantDarkMediumContrast = Color(0xFF40484E)
val onSurfaceVariantDarkMediumContrast = Color(0xFFC3CCD3)
val outlineDarkMediumContrast = Color(0xFF9CA4AB)
val outlineVariantDarkMediumContrast = Color(0xFF7C848B)
val scrimDarkMediumContrast = Color(0xFF000000)
val inverseSurfaceDarkMediumContrast = Color(0xFFE0E3E6)
val inverseOnSurfaceDarkMediumContrast = Color(0xFF272A2D)
val inversePrimaryDarkMediumContrast = Color(0xFF004E6B)
val surfaceDimDarkMediumContrast = Color(0xFF101416)
val surfaceBrightDarkMediumContrast = Color(0xFF363A3C)
val surfaceContainerLowestDarkMediumContrast = Color(0xFF0B0F11)
val surfaceContainerLowDarkMediumContrast = Color(0xFF191C1F)
val surfaceContainerDarkMediumContrast = Color(0xFF1D2023)
val surfaceContainerHighDarkMediumContrast = Color(0xFF272A2D)
val surfaceContainerHighestDarkMediumContrast = Color(0xFF323538)

//Dark Colors - High Contrast

val primaryDarkHighContrast = Color(0xFFF8FBFF)
val onPrimaryDarkHighContrast = Color(0xFF000000)
val primaryContainerDarkHighContrast = Color(0xFF8BD3FD)
val onPrimaryContainerDarkHighContrast = Color(0xFF000000)
val secondaryDarkHighContrast = Color(0xFFF8FBFF)
val onSecondaryDarkHighContrast = Color(0xFF000000)
val secondaryContainerDarkHighContrast = Color(0xFFB4CEE1)
val onSecondaryContainerDarkHighContrast = Color(0xFF000000)
val tertiaryDarkHighContrast = Color(0xFFFFF9FB)
val onTertiaryDarkHighContrast = Color(0xFF000000)
val tertiaryContainerDarkHighContrast = Color(0xFFEAB9FD)
val onTertiaryContainerDarkHighContrast = Color(0xFF000000)
val errorDarkHighContrast = Color(0xFFFFF9F9)
val onErrorDarkHighContrast = Color(0xFF000000)
val errorContainerDarkHighContrast = Color(0xFFFFBAB1)
val onErrorContainerDarkHighContrast = Color(0xFF000000)
val backgroundDarkHighContrast = Color(0xFF101416)
val onBackgroundDarkHighContrast = Color(0xFFE0E3E6)
val surfaceDarkHighContrast = Color(0xFF101416)
val onSurfaceDarkHighContrast = Color(0xFFFFFFFF)
val surfaceVariantDarkHighContrast = Color(0xFF40484E)
val onSurfaceVariantDarkHighContrast = Color(0xFFF8FBFF)
val outlineDarkHighContrast = Color(0xFFC3CCD3)
val outlineVariantDarkHighContrast = Color(0xFFC3CCD3)
val scrimDarkHighContrast = Color(0xFF000000)
val inverseSurfaceDarkHighContrast = Color(0xFFE0E3E6)
val inverseOnSurfaceDarkHighContrast = Color(0xFF000000)
val inversePrimaryDarkHighContrast = Color(0xFF002E41)
val surfaceDimDarkHighContrast = Color(0xFF101416)
val surfaceBrightDarkHighContrast = Color(0xFF363A3C)
val surfaceContainerLowestDarkHighContrast = Color(0xFF0B0F11)
val surfaceContainerLowDarkHighContrast = Color(0xFF191C1F)
val surfaceContainerDarkHighContrast = Color(0xFF1D2023)
val surfaceContainerHighDarkHighContrast = Color(0xFF272A2D)
val surfaceContainerHighestDarkHighContrast = Color(0xFF323538)

*/
