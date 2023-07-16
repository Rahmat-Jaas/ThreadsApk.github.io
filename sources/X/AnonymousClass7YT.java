package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7YT  reason: invalid class name */
public final class AnonymousClass7YT implements C146688mh {
    public final RenderNode A00 = new RenderNode("Compose");
    public final AndroidComposeView A01;

    public final void CjG(int i) {
        RenderNode renderNode = this.A00;
        if (AnonymousClass0wJ.A1T(0, 1)) {
            renderNode.setUseCompositingLayer(true, (Paint) null);
        } else if (AnonymousClass0wJ.A1T(0, 2)) {
            renderNode.setUseCompositingLayer(false, (Paint) null);
            renderNode.setHasOverlappingRendering(false);
            return;
        } else {
            renderNode.setUseCompositingLayer(false, (Paint) null);
        }
        renderNode.setHasOverlappingRendering(true);
    }

    public final boolean Clj(boolean z) {
        return this.A00.setHasOverlappingRendering(true);
    }

    public final void CpH(float f) {
        this.A00.setRotationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void CpI(float f) {
        this.A00.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void AI6() {
        this.A00.discardDisplayList();
    }

    public final void AJ0(Canvas canvas) {
        canvas.drawRenderNode(this.A00);
    }

    public final float AQV() {
        return this.A00.getAlpha();
    }

    public final int AU1() {
        return this.A00.getBottom();
    }

    public final boolean AXf() {
        return this.A00.getClipToBounds();
    }

    public final boolean AXg() {
        return this.A00.getClipToOutline();
    }

    public final float AfF() {
        return this.A00.getElevation();
    }

    public final boolean Ali() {
        return this.A00.hasDisplayList();
    }

    public final void AtY(Matrix matrix) {
        this.A00.getMatrix(matrix);
    }

    public final int BHP() {
        return this.A00.getTop();
    }

    public final void Bir(int i) {
        this.A00.offsetLeftAndRight(i);
    }

    public final void Biu(int i) {
        this.A00.offsetTopAndBottom(i);
    }

    public final void CZJ(C104126bH r5, C147018nF r6, AnonymousClass0YY r7) {
        RenderNode renderNode = this.A00;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        C04220Ms.A06(beginRecording);
        C123447Wy r2 = r5.A00;
        Canvas canvas = r2.A00;
        r2.A00 = beginRecording;
        if (r6 != null) {
            r2.Cfm();
            r2.ADN(r6, 1);
        }
        r7.invoke(r2);
        if (r6 != null) {
            r2.Ces();
        }
        r2.A00 = canvas;
        renderNode.endRecording();
    }

    public final void Chk(float f) {
        this.A00.setAlpha(f);
    }

    public final void Chn(int i) {
        this.A00.setAmbientShadowColor(i);
    }

    public final void Cib(float f) {
        this.A00.setCameraDistance(f);
    }

    public final void Cj4(boolean z) {
        this.A00.setClipToBounds(z);
    }

    public final void Cj5(boolean z) {
        this.A00.setClipToOutline(z);
    }

    public final void CkY(float f) {
        this.A00.setElevation(f);
    }

    public final void Cnd(Outline outline) {
        this.A00.setOutline(outline);
    }

    public final void Cnx(float f) {
        this.A00.setPivotX(f);
    }

    public final void Cny(float f) {
        this.A00.setPivotY(f);
    }

    public final boolean Co6(int i, int i2, int i3, int i4) {
        return this.A00.setPosition(i, i2, i3, i4);
    }

    public final void Cp4(C97726Cn r3) {
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass6F9.A00(this.A00);
        }
    }

    public final void CpJ(float f) {
        this.A00.setRotationZ(f);
    }

    public final void CpR(float f) {
        this.A00.setScaleX(f);
    }

    public final void CpS(float f) {
        this.A00.setScaleY(f);
    }

    public final void Cq4(int i) {
        this.A00.setSpotShadowColor(i);
    }

    public final void Cqr(float f) {
        this.A00.setTranslationX(f);
    }

    public final void Cqs(float f) {
        this.A00.setTranslationY(f);
    }

    public final int getHeight() {
        return this.A00.getHeight();
    }

    public final int getLeft() {
        return this.A00.getLeft();
    }

    public final int getRight() {
        return this.A00.getRight();
    }

    public final int getWidth() {
        return this.A00.getWidth();
    }

    public AnonymousClass7YT(AndroidComposeView androidComposeView) {
        this.A01 = androidComposeView;
    }
}
