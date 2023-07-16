package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass77C;
import X.AnonymousClass78U;
import X.AnonymousClass7J4;
import X.AnonymousClass8AQ;
import X.C02220Ah;
import X.C04220Ms;
import X.C104036b8;
import X.C120417Am;
import X.C121627Hb;
import X.C122137Ks;
import X.C123327Wm;
import X.C146498mL;
import X.C147188nY;
import X.C86104wH;
import X.C86114wI;
import X.C86154wM;
import X.C86164wN;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape5S0001000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S0001000_I2(int i, int i2) {
        super(3);
        this.A01 = i2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass0YY r0;
        String str;
        AnonymousClass0YY r02;
        Object obj4 = obj2;
        Object obj5 = obj;
        Object obj6 = obj3;
        switch (this.A01) {
            case 0:
                List list = (List) obj5;
                C147188nY A0H = C86104wH.A0H(obj4, obj6);
                C04220Ms.A0B(list, 0);
                AnonymousClass78U r6 = AnonymousClass78U.A01;
                C123327Wm r3 = Modifier.A00;
                Object obj7 = list.get(this.A00);
                if (C86164wN.A1Q(1, obj7)) {
                    r0 = C86154wM.A10(obj7, 0);
                } else {
                    r0 = InspectableValueKt.A00;
                }
                r6.A01(A0H, C120417Am.A01(r3, obj7, r0, 11), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 3072, 6, 0);
                break;
            case 1:
                C86164wN.A0G(obj4).A0P(this.A00);
                break;
            case 2:
                C146498mL r2 = (C146498mL) obj5;
                C04220Ms.A0B(r2, 0);
                int i = this.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    r2.D8Y();
                }
                break;
            case 3:
                C122137Ks r4 = (C122137Ks) obj4;
                C04220Ms.A0B(r4, 1);
                int i3 = this.A00;
                if (r4.A06 == 0) {
                    str = "Parameter offset is out of bounds";
                    if (C86114wI.A1S(i3)) {
                        if (i3 != 0) {
                            int i4 = r4.A00;
                            int i5 = r4.A08;
                            int i6 = r4.A01;
                            int i7 = i4;
                            while (true) {
                                int[] iArr = r4.A0E;
                                int A012 = C122137Ks.A01(r4, i7);
                                if (i3 > 0) {
                                    i7 += C86154wM.A03(A012, iArr);
                                    if (i7 <= i6) {
                                        i3--;
                                    }
                                } else {
                                    int A03 = C86154wM.A03(A012, iArr);
                                    int i8 = r4.A02;
                                    int A032 = C122137Ks.A03(r4, iArr, A012);
                                    int i9 = i7 + A03;
                                    int A02 = C122137Ks.A02(r4, iArr, i9);
                                    int i10 = A02 - A032;
                                    C122137Ks.A0A(r4, i10, Math.max(i4 - 1, 0));
                                    C122137Ks.A07(r4, A03);
                                    int[] iArr2 = r4.A0E;
                                    int A013 = C122137Ks.A01(r4, i9) * 5;
                                    System.arraycopy(iArr2, A013, iArr2, C122137Ks.A01(r4, i4) * 5, ((A03 * 5) + A013) - A013);
                                    if (i10 > 0) {
                                        Object[] objArr = r4.A0F;
                                        int i11 = A032 + i10;
                                        int i12 = r4.A0B;
                                        if (i11 >= i12) {
                                            i11 += r4.A09;
                                        }
                                        int i13 = A02 + i10;
                                        if (i13 >= i12) {
                                            i13 += r4.A09;
                                        }
                                        AnonymousClass8AQ.A0G(objArr, objArr, i8, i11, i13);
                                    }
                                    int i14 = A032 + i10;
                                    int i15 = i14 - i8;
                                    int i16 = r4.A0B;
                                    int i17 = r4.A09;
                                    int length = r4.A0F.length;
                                    int i18 = r4.A0A;
                                    int i19 = i4 + A03;
                                    for (int i20 = i4; i20 < i19; i20++) {
                                        int A014 = C122137Ks.A01(r4, i20);
                                        int A033 = C122137Ks.A03(r4, iArr2, A014) - i15;
                                        int i21 = i16;
                                        if (i18 < A014) {
                                            i21 = 0;
                                        }
                                        if (A033 > i21) {
                                            A033 = -(((length - i17) - A033) + 1);
                                        }
                                        if (A033 > i16) {
                                            A033 = -(((length - i17) - A033) + 1);
                                        }
                                        iArr2[(A014 * 5) + 4] = A033;
                                    }
                                    int i22 = A03 + i9;
                                    int A002 = C122137Ks.A00(r4);
                                    ArrayList arrayList = r4.A0C;
                                    int A022 = C121627Hb.A02(arrayList, i9, A002);
                                    if (A022 < 0) {
                                        A022 = -(A022 + 1);
                                    }
                                    ArrayList A0v = AnonymousClass0wJ.A0v();
                                    if (A022 >= 0) {
                                        while (A022 < arrayList.size()) {
                                            C104036b8 r10 = (C104036b8) C86164wN.A0b(arrayList, A022);
                                            C04220Ms.A0B(r10, 0);
                                            int i23 = r10.A00;
                                            if (i23 < 0) {
                                                i23 += C122137Ks.A00(r4);
                                            }
                                            if (i23 >= i9 && i23 < i22) {
                                                A0v.add(r10);
                                                arrayList = r4.A0C;
                                                arrayList.remove(A022);
                                            }
                                        }
                                    }
                                    int i24 = i4 - i9;
                                    int size = A0v.size();
                                    for (int i25 = 0; i25 < size; i25++) {
                                        C104036b8 r102 = (C104036b8) A0v.get(i25);
                                        C04220Ms.A0B(r102, 0);
                                        int i26 = r102.A00;
                                        if (i26 < 0) {
                                            i26 += C122137Ks.A00(r4);
                                        }
                                        int i27 = i26 + i24;
                                        if (i27 >= r4.A05) {
                                            r102.A00 = -(A002 - i27);
                                        } else {
                                            r102.A00 = i27;
                                        }
                                        ArrayList arrayList2 = r4.A0C;
                                        int A023 = C121627Hb.A02(arrayList2, i27, A002);
                                        if (A023 < 0) {
                                            A023 = -(A023 + 1);
                                        }
                                        arrayList2.add(A023, r102);
                                    }
                                    if (!C122137Ks.A0F(r4, i9, A03)) {
                                        C122137Ks.A0C(r4, i5, r4.A01, i4);
                                        if (i10 > 0) {
                                            int i28 = r4.A09;
                                            int i29 = i14 + i10;
                                            C122137Ks.A0B(r4, i29, i9 - 1);
                                            r4.A0B = i14;
                                            r4.A09 = i28 + i10;
                                            Arrays.fill(r4.A0F, i14, i29, (Object) null);
                                            int i30 = r4.A03;
                                            if (i30 >= i14) {
                                                r4.A03 = i30 - i10;
                                                break;
                                            }
                                        }
                                    } else {
                                        str = "Unexpectedly removed anchors";
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str = "Cannot move a group while inserting";
                }
                AnonymousClass7J4.A02(str);
                throw null;
            default:
                List list2 = (List) obj5;
                C147188nY A0H2 = C86104wH.A0H(obj4, obj6);
                C04220Ms.A0B(list2, 0);
                int i31 = this.A00;
                if (i31 < list2.size()) {
                    AnonymousClass77C r5 = AnonymousClass77C.A00;
                    C123327Wm r32 = Modifier.A00;
                    Object obj8 = list2.get(i31);
                    if (C86164wN.A1Q(1, obj8)) {
                        r02 = C86164wN.A0s(obj8, 46);
                    } else {
                        r02 = InspectableValueKt.A00;
                    }
                    r5.A00(A0H2, C120417Am.A01(r32, obj8, r02, 25), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 3072, 6, 0);
                    break;
                }
                break;
        }
        return Unit.A00;
    }
}
