package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RenderNode;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7xE  reason: invalid class name and case insensitive filesystem */
public final class C134207xE implements C27944Evu {
    public boolean A00 = true;
    public C134197xD A01;
    public final float A02;
    public final Rect A03 = C86134wK.A0D();
    public final RenderNode A04;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.hasDisplayList() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJF(android.graphics.Canvas r7, X.C25892DuC r8, X.C25801DsF r9) {
        /*
            r6 = this;
            r5 = 0
            X.7xD r0 = r6.A01
            if (r0 != 0) goto L_0x0085
            boolean r0 = r7.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0065
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0017
            android.graphics.RenderNode r3 = r6.A04
            boolean r0 = r3.hasDisplayList()
            if (r0 != 0) goto L_0x0044
        L_0x0017:
            android.graphics.RenderNode r3 = r6.A04
            android.graphics.RecordingCanvas r4 = r3.beginRecording()
            X.C04220Ms.A06(r4)
            android.graphics.Rect r2 = r8.A05     // Catch:{ all -> 0x003a }
            int r0 = r2.left     // Catch:{ all -> 0x003a }
            float r0 = (float) r0     // Catch:{ all -> 0x003a }
            float r1 = -r0
            int r0 = r2.top     // Catch:{ all -> 0x003a }
            float r0 = (float) r0     // Catch:{ all -> 0x003a }
            float r2 = -r0
            r4.translate(r1, r2)     // Catch:{ all -> 0x003a }
            android.graphics.drawable.Drawable r0 = r8.A00     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0034
            r0.draw(r4)     // Catch:{ all -> 0x003a }
        L_0x0034:
            float r1 = -r1
            float r0 = -r2
            r4.translate(r1, r0)     // Catch:{ all -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r0 = move-exception
            r3.endRecording()
            throw r0
        L_0x003f:
            r3.endRecording()
            r6.A00 = r5
        L_0x0044:
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0061
            float r0 = r9.A02
            r3.setTranslationX(r0)
            float r0 = r9.A03
            r3.setTranslationY(r0)
            float r0 = r9.A01
            r3.setScaleX(r0)
            float r0 = r9.A01
            r3.setScaleY(r0)
            float r0 = r9.A00
            r3.setRotationZ(r0)
        L_0x0061:
            r7.drawRenderNode(r3)
            return
        L_0x0065:
            X.7xD r0 = r6.A01
            if (r0 != 0) goto L_0x007c
            float r0 = r6.A02
            X.7xD r1 = new X.7xD
            r1.<init>(r0)
            android.graphics.Rect r0 = r6.A03
            r1.CmJ(r0)
            r6.A01 = r1
            android.graphics.RenderNode r0 = r6.A04
            r0.discardDisplayList()
        L_0x007c:
            X.7xD r0 = r6.A01
            if (r0 != 0) goto L_0x0085
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0085:
            r0.AJF(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134207xE.AJF(android.graphics.Canvas, X.DuC, X.DsF):void");
    }

    public final void CkF(boolean z) {
        this.A00 = true;
    }

    public final void CmJ(Rect rect) {
        this.A03.set(rect);
        C134197xD r0 = this.A01;
        if (r0 != null) {
            r0.CmJ(rect);
        }
        RenderNode renderNode = this.A04;
        renderNode.setPosition(rect);
        float f = this.A02;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            Outline outline = new Outline();
            outline.setRoundRect(0, 0, rect.width(), rect.height(), f);
            renderNode.setOutline(outline);
        }
        this.A00 = true;
    }

    public C134207xE(String str, float f) {
        RenderNode renderNode = new RenderNode(str);
        this.A02 = f;
        this.A04 = renderNode;
        if (this.A02 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            renderNode.setClipToOutline(true);
        }
    }

    public final void cleanup() {
        this.A04.discardDisplayList();
    }
}
