/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.networks.data

import com.google.android.horologist.annotations.ExperimentalHorologistApi
import java.time.Instant

@ExperimentalHorologistApi
public sealed class Status(public val order: Int) {
    @ExperimentalHorologistApi
    public object Available : Status(order = 1) {
        override fun toString(): String = "Available"
    }

    @ExperimentalHorologistApi
    public class Losing(public val instant: Instant) : Status(order = 2) {
        override fun toString(): String = "Losing"
    }

    @ExperimentalHorologistApi
    public object Lost : Status(order = 3) {
        override fun toString(): String = "Lost"
    }

    @ExperimentalHorologistApi
    public object Unknown : Status(order = 4) {
        override fun toString(): String = "Unknown"
    }
}
