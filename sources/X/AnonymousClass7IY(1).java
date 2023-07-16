package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7IY  reason: invalid class name */
public final class AnonymousClass7IY {
    public static final AnonymousClass7IY A00 = new AnonymousClass7IY();

    public final AnonymousClass78x A03(C146608mW r12, AnonymousClass78x r13) {
        ArrayList A0s = C18200wM.A0s(r13.A06);
        ArrayList A0s2 = C18200wM.A0s(r13.A02);
        ArrayList A0s3 = C18200wM.A0s(r13.A04);
        ArrayList A0s4 = C18200wM.A0s(r13.A03);
        ArrayList A0s5 = C18200wM.A0s(r13.A05);
        long j = r13.A00;
        switch (r12.BDn().intValue()) {
            case 0:
                A01(r12, A0s);
                float B16 = r12.B16();
                if (B16 >= 1.0f || B16 < 0.5f) {
                    if (B16 == 1.0f) {
                        A01(r12, A0s2);
                        A01(r12, A0s3);
                        break;
                    }
                } else {
                    A01(r12, A0s2);
                    break;
                }
                break;
            case 1:
                A02(r12, A0s);
                A02(r12, A0s2);
                A02(r12, A0s3);
                A02(r12, A0s4);
                A02(r12, A0s5);
                break;
            default:
                if (C18190wL.A1a(A0s) || r12.AjQ()) {
                    float B162 = r12.B16();
                    if (B162 >= 1.0f || B162 < 0.5f) {
                        if (B162 != 1.0f) {
                            if (B162 < 0.5f && B162 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                if (r12.AjQ()) {
                                    A05(r12, A0s);
                                }
                                A02(r12, A0s2);
                                A02(r12, A0s3);
                                break;
                            } else {
                                AnonymousClass0LU.A0B("UnifiedTimeEntryMerger", "when percent is zero percent, it should never be FBMerlinVPVStatusUpdate status.");
                                break;
                            }
                        } else {
                            A05(r12, A0s3);
                        }
                    } else {
                        A02(r12, A0s3);
                    }
                    A05(r12, A0s2);
                    if (r12.AjQ()) {
                        A05(r12, A0s);
                        break;
                    }
                }
                break;
        }
        return new AnonymousClass78x(r13.A01, A0s, A0s2, A0s3, A0s4, A0s5, j);
    }

    public final C107146gF A04(C146608mW r5, C107146gF r6) {
        AnonymousClass78x r3 = r6.A00;
        AnonymousClass78x r2 = r6.A01;
        if (r5.AxB()) {
            r3 = A03(r5, r3);
        } else {
            if (r5.BDn() == AnonymousClass006.A01 && !r3.A01()) {
                r3 = A03(r5, r3);
            }
            r2 = A03(r5, r2);
        }
        return new C107146gF(r2, r3);
    }

    public static final AnonymousClass78x A00(String str) {
        return new AnonymousClass78x(str, AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), -1);
    }

    public static final void A01(C146608mW r6, List list) {
        C107136gE r4;
        if (list.isEmpty()) {
            r4 = new C107136gE(r6.BGk(), -1);
        } else {
            C107136gE r1 = (C107136gE) list.get(C86104wH.A0B(list));
            if (r1.A01 != -1 && r1.A00 == -1) {
                AnonymousClass0LU.A0B("UnifiedTimeEntryMerger", "Unexpected last time entry with exit timestamp placeholder");
            }
            r4 = new C107136gE(r6.BGk(), -1);
        }
        list.add(r4);
    }

    public static final void A02(C146608mW r6, List list) {
        if (!list.isEmpty()) {
            C107136gE r5 = (C107136gE) list.get(C86104wH.A0B(list));
            if (r5.A00 == -1) {
                list.set(C86104wH.A0B(list), new C107136gE(r5.A01, r6.BGk()));
            }
        }
    }

    public final void A05(C146608mW r7, List list) {
        if (!list.isEmpty()) {
            C107136gE r5 = (C107136gE) list.get(C86104wH.A0B(list));
            if (r5.A01 == -1 || r5.A00 == -1) {
                return;
            }
        }
        A01(r7, list);
    }
}
