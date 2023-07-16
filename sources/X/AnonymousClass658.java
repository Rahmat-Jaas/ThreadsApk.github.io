package X;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;

/* renamed from: X.658  reason: invalid class name */
public final class AnonymousClass658 extends C25032DeL {
    public final Rect A00 = C86134wK.A0D();
    public final RenderNode A01 = new RenderNode("SharedCanvasRenderNode");

    public final void A02(AnonymousClass0YY r6) {
        C04220Ms.A0B(r6, 0);
        RenderNode renderNode = this.A01;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        C04220Ms.A06(beginRecording);
        try {
            Rect rect = this.A00;
            beginRecording.translate(-((float) rect.left), -((float) rect.top));
            r6.invoke(beginRecording);
            C86134wK.A11(beginRecording, rect);
        } finally {
            renderNode.endRecording();
        }
    }

    public final boolean A05(Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            return false;
        }
        canvas.drawRenderNode(this.A01);
        return true;
    }

    public final void A00() {
        this.A01.discardDisplayList();
    }

    public final void A01(Rect rect) {
        this.A00.set(rect);
        this.A01.setPosition(rect);
    }

    public final boolean A03() {
        return this.A01.hasDisplayList();
    }

    public final boolean A04() {
        return true;
    }
}
