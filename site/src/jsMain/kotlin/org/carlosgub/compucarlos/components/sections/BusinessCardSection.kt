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
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import org.carlosgub.compucarlos.components.widgets.WhatsAppButton
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun BusinessCardSection() {
    DesktopContainer()
    MobileContainer()
}

@Composable
private fun DesktopContainer() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(2.cssRem)
            .backgroundColor(Color.rgb(250, 250, 250))
            .displayIfAtLeast(Breakpoint.MD),
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .maxWidth(1200.px)
                .height(800.px)
                .borderRadius(1.cssRem)
                .boxShadow(1.px, 2.px, 1.px, 0.px, Color.rgba(0, 0, 0, 0.1f))
                .gap(0.px)
                .margin(autoLength),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image()
            Info()
        }
    }
}

@Composable
private fun MobileContainer() {
    Box(
        Modifier
            .minHeight(100.vh)
            .padding(2.cssRem)
            .backgroundColor(Color.rgb(250, 250, 250))
            .displayUntil(Breakpoint.MD),
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .margin(autoLength),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            InfoMobile()
        }
    }
}

@Composable
private fun Image() {
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
}

@Composable
private fun Info() {
    Column(
        modifier = Modifier.fillMaxHeight()
            .padding(2.5.cssRem, 2.cssRem)
            .padding(topBottom = 100.px, leftRight = 24.px),
        verticalArrangement = Arrangement.Center
    ) {
        Title()
        Subtitle()
        BodyMessage()
        BodyIcons()
        WhatsAppButton()
    }
}

@Composable
private fun InfoMobile() {
    Column(
        modifier = Modifier
            .padding(topBottom = 24.px)
            .textAlign(TextAlign.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Title()
        Subtitle()
        BodyMessage()
        BodyIcons()
        WhatsAppButton()
    }
}

@Composable
private fun Title() {
    H1(
        attrs = Modifier
            .fontSize(2.5.cssRem)
            .fontWeight(FontWeight.Bold)
            .color(
                Color.rgb(
                    30,
                    41,
                    59
                )
            )
            .margin(0.px)
            .toAttrs()
    ) {
        Text("CompuCarlos")
    }
}

@Composable
private fun Subtitle() {
    H2(
        attrs = Modifier
            .fontSize(2.cssRem)
            .fontWeight(FontWeight.SemiBold)
            .color(
                Color.rgb(
                    71,
                    85,
                    105
                )
            )
            .margin(
                top = 0.5.cssRem,
                bottom = 1.5.cssRem
            )
            .toAttrs()
    ) {
        Text("Servicio técnico para computadoras")
    }
}

@Composable
private fun BodyMessage() {
    Span(
        attrs = Modifier
            .fontSize(1.1.cssRem)
            .color(
                Color.rgb(
                    51,
                    65,
                    85
                )
            )
            .margin(bottom = 1.5.cssRem)
            .toAttrs()
    ) {
        Text("Reparación, mantenimiento, formateo, actualización y más.")
        Br()
        Text("Atención rápida y garantizada para laptops y PCs.")
    }
}

@Composable
private fun BodyIcons() {
    Column(Modifier.gap(0.5.cssRem)) {
        Ubication()
        Cellphone()
    }
}

@Composable
private fun Ubication() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        SpanText("📍", Modifier.fontSize(1.2.cssRem))
        SpanText(
            " Chaclacayo, Lima, Perú",
            modifier = Modifier
                .fontSize(1.1.cssRem)
                .margin(left = 0.5.cssRem)
                .color(Color.rgb(51, 65, 85))
        )
    }
}

@Composable
private fun Cellphone() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        SpanText("📞", Modifier.fontSize(1.2.cssRem))
        A(href = "tel:902899059") {
            SpanText(
                " 902-899-059", Modifier
                    .fontSize(1.1.cssRem)
                    .margin(left = 0.5.cssRem)
                    .color(Color.rgb(51, 65, 85))
            )
        }
    }
}