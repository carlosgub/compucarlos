package org.carlosgub.compucarlos.components.widgets

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.attributes.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors.White
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textDecorationLine
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.icons.fa.FaWhatsapp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize

@Composable
fun WhatsAppButton() {
    val url = "https://wa.me/+51902899059?text=Hola quisiera hablar con un técnico"

    A(
        href = url,
        attrs = Modifier
            .backgroundColor(Color.rgb(37, 211, 102))
            .color(White)
            .margin(topBottom = 12.px)
            .padding(12.px, 20.px)
            .borderRadius(10.px)
            .textDecorationLine(TextDecorationLine.None)
            .fontWeight(FontWeight.Bold)
            .fontSize(16.px)
            .transition(Transition.of("background-color", 0.3.s))
            .toAttrs {
                target(ATarget.Blank)
            },
    ) {
        FaWhatsapp(
            size = IconSize.LG,
            modifier = Modifier.margin(right = 8.px)
        )
        Text("Háblanos por WhatsApp")
    }
}