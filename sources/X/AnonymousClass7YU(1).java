package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7YU  reason: invalid class name */
public final class AnonymousClass7YU implements C146688mh {
    public static boolean A07 = true;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final RenderNode A05;
    public final AndroidComposeView A06;

    public final void CZJ(C104126bH r7, C147018nF r8, AnonymousClass0YY r9) {
        RenderNode renderNode = this.A05;
        Canvas start = renderNode.start(this.A02 - this.A01, this.A00 - this.A03);
        C04220Ms.A06(start);
        C123447Wy r2 = r7.A00;
        Canvas canvas = r2.A00;
        Canvas canvas2 = start;
        C04220Ms.A0B(canvas2, 0);
        r2.A00 = canvas2;
        if (r8 != null) {
            r2.Cfm();
            r2.ADN(r8, 1);
        }
        r9.invoke(r2);
        if (r8 != null) {
            r2.Ces();
        }
        r2.A00 = canvas;
        renderNode.end(start);
    }

    public final void CjG(int i) {
        int i2;
        RenderNode renderNode;
        if (AnonymousClass0wJ.A1T(0, 1)) {
            renderNode = this.A05;
            i2 = 2;
        } else {
            boolean A1T = AnonymousClass0wJ.A1T(0, 2);
            i2 = 0;
            renderNode = this.A05;
            if (A1T) {
                renderNode.setLayerType(0);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
        }
        renderNode.setLayerType(i2);
        renderNode.setHasOverlappingRendering(true);
    }

    public final boolean Clj(boolean z) {
        return this.A05.setHasOverlappingRendering(true);
    }

    public final void CpH(float f) {
        this.A05.setRotationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void CpI(float f) {
        this.A05.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void AI6() {
        AnonymousClass6FA.A00(this.A05);
    }

    public final void AJ0(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.A05);
    }

    public final float AQV() {
        return this.A05.getAlpha();
    }

    public final int AU1() {
        return this.A00;
    }

    public final boolean AXf() {
        return this.A04;
    }

    public final boolean AXg() {
        return this.A05.getClipToOutline();
    }

    public final float AfF() {
        return this.A05.getElevation();
    }

    public final boolean Ali() {
        return this.A05.isValid();
    }

    public final void AtY(Matrix matrix) {
        this.A05.getMatrix(matrix);
    }

    public final int BHP() {
        return this.A03;
    }

    public final void Bir(int i) {
        this.A01 += i;
        this.A02 += i;
        this.A05.offsetLeftAndRight(i);
    }

    public final void Biu(int i) {
        this.A03 += i;
        this.A00 += i;
        this.A05.offsetTopAndBottom(i);
    }

    public final void Chk(float f) {
        this.A05.setAlpha(f);
    }

    public final void Chn(int i) {
        AnonymousClass7FR.A02(this.A05, i);
    }

    public final void Cib(float f) {
        this.A05.setCameraDistance(-f);
    }

    public final void Cj4(boolean z) {
        this.A04 = z;
        this.A05.setClipToBounds(z);
    }

    public final void Cj5(boolean z) {
        this.A05.setClipToOutline(z);
    }

    public final void CkY(float f) {
        this.A05.setElevation(f);
    }

    public final void Cnd(Outline outline) {
        this.A05.setOutline(outline);
    }

    public final void Cnx(float f) {
        this.A05.setPivotX(f);
    }

    public final void Cny(float f) {
        this.A05.setPivotY(f);
    }

    public final boolean Co6(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        return this.A05.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public final void CpJ(float f) {
        this.A05.setRotation(f);
    }

    public final void CpR(float f) {
        this.A05.setScaleX(f);
    }

    public final void CpS(float f) {
        this.A05.setScaleY(f);
    }

    public final void Cq4(int i) {
        AnonymousClass7FR.A03(this.A05, i);
    }

    public final void Cqr(float f) {
        this.A05.setTranslationX(f);
    }

    public final void Cqs(float f) {
        this.A05.setTranslationY(f);
    }

    public final int getHeight() {
        return this.A00 - this.A03;
    }

    public final int getLeft() {
        return this.A01;
    }

    public final int getRight() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A02 - this.A01;
    }

    public AnonymousClass7YU(AndroidComposeView androidComposeView) {
        this.A06 = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        C04220Ms.A06(create);
        this.A05 = create;
        if (A07) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            AnonymousClass7FR.A02(create, AnonymousClass7FR.A00(create));
            AnonymousClass7FR.A03(create, AnonymousClass7FR.A01(create));
            AnonymousClass6FA.A00(this.A05);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            A07 = false;
        }
    }

    public final void Cp4(C97726Cn r1) {
    }
}
