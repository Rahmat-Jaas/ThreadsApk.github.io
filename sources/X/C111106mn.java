package X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6mn  reason: invalid class name and case insensitive filesystem */
public final class C111106mn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C107946hZ A04;
    public SpritesheetInfo A05;
    public List A06;
    public List A07;
    public boolean A08;

    public C111106mn(AnonymousClass3HX r14, C127397h3 r15) {
        AnonymousClass3HX r7;
        C127397h3 A0K = r15.A0K(35);
        AnonymousClass7Ko.A07(A0K, "Canvas model wasn't found for LineChartV2 node");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Iterator it = A0K.A0R(35).iterator();
        while (it.hasNext()) {
            A0v.add(C86114wI.A0m(C86144wL.A0V(it).A04, 35));
        }
        Iterator it2 = A0K.A0R(36).iterator();
        while (it2.hasNext()) {
            A0v2.add(C86114wI.A0m(C86144wL.A0V(it2).A04, 35));
        }
        this.A03 = (int) A0K.A0G(42, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A02 = (int) A0K.A0G(40, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01 = (int) A0K.A0G(41, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A00 = (int) A0K.A0G(38, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A04 = new C107946hZ((String[]) C86144wL.A1b(A0v2), (String[]) C86144wL.A1b(A0v));
        this.A06 = AnonymousClass0wJ.A0v();
        Iterator it3 = r15.A0R(38).iterator();
        while (true) {
            r7 = r14;
            if (!it3.hasNext()) {
                break;
            }
            this.A06.add(C117956zW.A01(r7, (C127397h3) it3.next(), this.A03, this.A02, this.A01, this.A00));
        }
        this.A07 = AnonymousClass0wJ.A0v();
        for (C127397h3 A012 : r15.A0R(40)) {
            this.A07.add(C117956zW.A01(r7, A012, this.A03, this.A02, this.A01, this.A00));
        }
        this.A08 = AnonymousClass2LL.A00(C127397h3.A0A(r15, 42), false);
        try {
            String A0m = C86114wI.A0m(r15.A04, 41);
            if (A0m != null) {
                this.A05 = AnonymousClass6TJ.parseFromJson(C18180wK.A0L(A0m)).A00;
            }
        } catch (IOException unused) {
        }
    }
}
