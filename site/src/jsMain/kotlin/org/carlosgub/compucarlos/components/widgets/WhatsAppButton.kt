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
import com.varabyte.kobweb.compose.ui.styleModifier

@Composable
fun WhatsAppButton() {
    val url = "https://wa.me/+51902899059?text=Hola quisiera hablar con un técnico"

    A(
        href = url,
        attrs = Modifier
            .styleModifier {
                backgroundColor(Color.rgb(37, 211, 102)) // WhatsApp green
                color(White)
                padding(12.px, 20.px)
                borderRadius(10.px)
                textDecoration("none")
                fontWeight("bold")
                fontSize(16.px)
                transition(Transition.of("background-color",0.3.s))
                /*hover {
                    backgroundColor(Color.rgb(30, 180, 90))
                }*/
            }.toAttrs{
            target(ATarget.Blank)
        },
    ) {
        Text("Chat on WhatsApp")
    }
}