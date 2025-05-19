package org.carlosgub.compucarlos.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.BackgroundPosition
import com.varabyte.kobweb.compose.css.BackgroundRepeat
import com.varabyte.kobweb.compose.css.BackgroundSize
import com.varabyte.kobweb.compose.css.CSSColor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.color
import com.varabyte.kobweb.compose.css.fontWeight
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors.Black
import com.varabyte.kobweb.compose.ui.graphics.Colors.White
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.backgroundPosition
import com.varabyte.kobweb.compose.ui.modifiers.backgroundRepeat
import com.varabyte.kobweb.compose.ui.modifiers.backgroundSize
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.flexGrow
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import org.carlosgub.compucarlos.components.sections.BusinessCardSection
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    BusinessCardSection()
}

@Composable
private fun ChatGPT(){
    Section(
        attrs = Modifier
            .fillMaxWidth()
            .minHeight(100.vh)
            .padding(32.px)
            .background(Color.rgb(245, 245, 245))
            .toAttrs()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(1200.px)
                .margin{ auto }
                .gap(32.px)
                .classNames("wrap"),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // Left: Image
            Img(
                src = "/background.webp", // Place in `resources/static`
                attrs = Modifier
                    .width(50.vw)
                    .fillMaxWidth()
                    .borderRadius(16.px)
                    .classNames("hero-shadow")
                    .weight(1f)
                    .toAttrs()
            )

            // Right: Info
            Column(
                modifier = Modifier
                    .width(50.vw)
                    .fillMaxWidth()
                    .flexGrow(1.0)
                    .gap(16.px)
            ) {
                H1(attrs = {
                    style {
                        fontSize(48.px)
                        fontWeight(FontWeight.Bold)
                        color("#000")
                    }
                }) {
                    Text("CompuCarlos")
                }
                H1(attrs = {
                    style {
                        fontSize(20.px)
                        color("#000")
                    }
                }) {
                    Text("Servicio técnico para computadoras")
                }
                H1(attrs = {
                    style {
                        fontSize(16.px)
                        color("#000")
                    }
                }) {
                    Text("Reparación, mantenimiento, formateo, actualización y más. " +
                            "Atención rápida y garantizada para laptops y PCs.")
                }

                Column(modifier = Modifier.gap(4.px)) {
                    H1(attrs = {
                        style {
                            fontSize(14.px)
                            color("#000")
                        }
                    }) {
                        Text("📍 Lima, Perú")
                    }
                    H1(attrs = {
                        style {
                            fontSize(14.px)
                            color("#000")
                        }
                    }) {
                        Text("📞 987-654-321")
                    }
                    H1(attrs = {
                        style {
                            fontSize(14.px)
                        }
                    }) {
                        Text("📧 contacto@compucarlos.com")
                    }
                }

                Button(
                    onClick = { /* Maybe navigate to contact section */ },
                    modifier = Modifier.margin(top = 16.px)
                ) {
                    Text("Solicitar Servicio")
                }
            }
        }
    }
}
