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

package com.google.android.horologist.media.data.repository

import com.google.android.horologist.annotations.ExperimentalHorologistApi
import com.google.android.horologist.media.data.datasource.Media3DownloadDataSource
import com.google.android.horologist.media.repository.MediaDownloadRepository

@ExperimentalHorologistApi
public class MediaDownloadRepositoryImpl(
    private val media3DownloadDataSource: Media3DownloadDataSource
) :
    MediaDownloadRepository {

    override fun remove(mediaId: String) {
        media3DownloadDataSource.removeDownload(mediaId)
    }
}
