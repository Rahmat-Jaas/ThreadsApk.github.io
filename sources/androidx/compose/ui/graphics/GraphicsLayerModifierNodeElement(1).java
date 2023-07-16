package androidx.compose.ui.graphics;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C123307Wk;
import X.C142918fo;
import X.C18190wL;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import com.facebook.react.uimanager.BaseViewManager;

public final class GraphicsLayerModifierNodeElement extends C123307Wk {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C142918fo A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphicsLayerModifierNodeElement) {
                GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) obj;
                if (!(Float.compare(this.A02, graphicsLayerModifierNodeElement.A02) == 0 && Float.compare(this.A03, graphicsLayerModifierNodeElement.A03) == 0 && Float.compare(this.A00, graphicsLayerModifierNodeElement.A00) == 0 && Float.compare(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0 && Float.compare(this.A01, graphicsLayerModifierNodeElement.A01) == 0 && Float.compare(8.0f, 8.0f) == 0 && this.A06 == graphicsLayerModifierNodeElement.A06 && C04220Ms.A0I(this.A07, graphicsLayerModifierNodeElement.A07) && this.A08 == graphicsLayerModifierNodeElement.A08 && this.A04 == graphicsLayerModifierNodeElement.A04 && this.A05 == graphicsLayerModifierNodeElement.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A02), this.A03), this.A00);
        int floatToIntBits = Float.floatToIntBits(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        int A053 = AnonymousClass0wJ.A05(this.A07, C86104wH.A06(C86104wH.A05(C86104wH.A05((((((((((A052 + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31, this.A01), 8.0f), this.A06));
        boolean z = this.A08;
        if (z) {
            z = true;
        }
        return C86104wH.A06(C86104wH.A06((A053 + (z ? 1 : 0)) * 31 * 31, this.A04), this.A05);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("GraphicsLayerModifierNodeElement(scaleX=");
        A0s.append(this.A02);
        A0s.append(", scaleY=");
        A0s.append(this.A03);
        A0s.append(", alpha=");
        C86104wH.A1U(A0s, this.A00);
        A0s.append(this.A01);
        A0s.append(", cameraDistance=");
        A0s.append(8.0f);
        A0s.append(", transformOrigin=");
        A0s.append(AnonymousClass00U.A0G("TransformOrigin(packedValue=", ')', this.A06));
        A0s.append(", shape=");
        A0s.append(this.A07);
        A0s.append(", clip=");
        A0s.append(this.A08);
        A0s.append(", renderEffect=");
        A0s.append((Object) null);
        A0s.append(", ambientShadowColor=");
        C86154wM.A18(this.A04, A0s);
        A0s.append(", spotShadowColor=");
        C86154wM.A18(this.A05, A0s);
        A0s.append(", compositingStrategy=");
        A0s.append(AnonymousClass00U.A0E("CompositingStrategy(value=", ')', 0));
        return C86114wI.A0q(A0s, ')');
    }

    public GraphicsLayerModifierNodeElement(C142918fo r1, float f, float f2, float f3, float f4, long j, long j2, long j3, boolean z) {
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A06 = j;
        this.A07 = r1;
        this.A08 = z;
        this.A04 = j2;
        this.A05 = j3;
    }
}
