@file:Suppress("UNUSED")

/**
 * SaltUI
 * Copyright (C) 2023 Moriafly
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */

package com.moriafly.salt.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * TitleBar
 */
@UnstableSaltApi
@Composable
fun TitleBar(
    onBack: () -> Unit,
    text: String,
    showBackBtn: Boolean = true,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        if (showBackBtn) {
            Icon(
                modifier = Modifier
                    .fadeClickable {
                        onBack()
                    }
                    .size(56.dp)
                    .padding(18.dp),
                painter = painterResource(id = R.drawable.ic_arrow_back),
                contentDescription = stringResource(id = R.string.back),
                tint = SaltTheme.colors.text
            )
        }
        Text(
            text = text,
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
                .padding(horizontal = 56.dp),
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            style = SaltTheme.textStyles.main
        )
    }
}

/**
 * BottomBar
 */
@UnstableSaltApi
@Composable
fun BottomBar(
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = SaltTheme.colors.subBackground)
    ) {
        content()
    }
}

/**
 * BottomBarItem
 */
@UnstableSaltApi
@Composable
fun RowScope.BottomBarItem(
    state: Boolean,
    onClick: () -> Unit,
    painter: Painter,
    text: String
) {
    Column(
        modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .fadeClickable {
                onClick()
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val color = if (state) SaltTheme.colors.highlight else SaltTheme.colors.subText.copy(alpha = 0.5f)
        Icon(
            modifier = Modifier
                .size(24.dp),
            painter = painter,
            contentDescription = null,
            tint = color
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = text,
            color = color,
            fontSize = 10.sp,
            style = SaltTheme.textStyles.sub
        )
    }
}