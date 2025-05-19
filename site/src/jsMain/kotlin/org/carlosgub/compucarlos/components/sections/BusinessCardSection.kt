package org.carlosgub.compucarlos.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.*
import com.varabyte.kobweb.compose.ui.graphics.Color
import org.carlosgub.compucarlos.components.widgets.WhatsAppButton

@Composable
fun BusinessCardSection() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(2.cssRem)
            .backgroundColor(Color.rgb(250, 250, 250)),
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .maxWidth(1200.px)
                .height(800.px)
                .borderRadius(1.cssRem)
                .boxShadow(1.px, 2.px, 24.px,0.px, Color.rgba(0,0,0,0.08f))
                .gap(0.px)
                .margin(autoLength),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left: Image
            Box(
                modifier = Modifier
                    .width(500.px)
                    .fillMaxHeight()
                    .overflow(Overflow.Hidden)
                    .borderRadius(topLeft = 1.cssRem, bottomLeft = 1.cssRem)
            ) {
                Image(
                    src = "/background.webp",
                    modifier = Modifier.fillMaxSize()
                )
            }
            // Right: Info
            Box(
                modifier = Modifier
                    .padding(2.5.cssRem, 2.cssRem)
                    .padding(topBottom = 100.px, leftRight = 24.px)) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    SpanText(
                        "CompuCarlos",
                        modifier = Modifier
                            .fontSize(2.5.cssRem)
                            .fontWeight(FontWeight.Bold)
                            .color(Color.rgb(30, 41, 59))
                    )
                    SpanText(
                        "Servicio técnico para computadoras",
                        Modifier.fontSize(2.cssRem).fontWeight(FontWeight.SemiBold).color(Color.rgb(71, 85, 105)).margin(top = 0.5.cssRem, bottom = 1.5.cssRem)
                    )
                    SpanText(
                        "Reparación, mantenimiento, formateo, actualización y más.",
                        Modifier.fontSize(1.1.cssRem).color(Color.rgb(51, 65, 85))
                    )
                    SpanText(
                        "Atención rápida y garantizada para laptops y PCs.",
                        Modifier.fontSize(1.1.cssRem).color(Color.rgb(51, 65, 85)).margin(bottom = 1.5.cssRem)
                    )

                    Column(Modifier.gap(0.5.cssRem)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SpanText("📍", Modifier.fontSize(1.2.cssRem))
                            SpanText(" Chaclacayo, Lima, Perú",
                                modifier = Modifier
                                .fontSize(1.1.cssRem)
                                .margin(left = 0.5.cssRem)
                                .color(Color.rgb(51, 65, 85))
                            )
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SpanText("📞", Modifier.fontSize(1.2.cssRem))
                            SpanText(" 902-899-059", Modifier
                                .fontSize(1.1.cssRem)
                                .margin(left = 0.5.cssRem)
                                .color(Color.rgb(51, 65, 85)))
                        }
                        WhatsAppButton()
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SpanText("✉️", Modifier.fontSize(1.2.cssRem))
                            SpanText(" contacto@compucarlos.com", Modifier
                                .fontSize(1.1.cssRem)
                                .margin(left = 0.5.cssRem)
                                .color(Color.rgb(51, 65, 85)))
                        }
                    }
                }
            }
        }
    }
} 