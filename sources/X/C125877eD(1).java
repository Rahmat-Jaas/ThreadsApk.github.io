package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.7eD  reason: invalid class name and case insensitive filesystem */
public final class C125877eD implements C145198k2 {
    public final C145188k1 A00;
    public final C145788l5 A01;
    public final AnonymousClass68S A02;
    public final C121547Gq A03;
    public final C147128nR A04;
    public final C86004w7 A05;
    public final C146918n5 A06;

    public final String BIu() {
        return AnonymousClass000.A00(1051);
    }

    public final AnonymousClass5Id CX5(C145188k1 r14, List list) {
        String str;
        List list2;
        AnonymousClass0ZV r1;
        String str2;
        C147128nR r3 = this.A04;
        if (!r3.BU8()) {
            r1 = AnonymousClass0ZV.A00;
            str2 = "cannot extract features";
        } else {
            if (!r3.BU8()) {
                list2 = AnonymousClass0ZV.A00;
            } else {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    DcpContext dcpContext = (DcpContext) pair.A00;
                    String str3 = (String) pair.A01;
                    ArrayList<FeatureData> A0v2 = AnonymousClass0wJ.A0v();
                    AnonymousClass5Id ALA = this.A00.ALA(dcpContext);
                    if (ALA.A02) {
                        A0v2.addAll((Collection) ALA.A00);
                    } else {
                        String str4 = ALA.A01;
                        if (str4 == null) {
                            str4 = "example_error";
                        }
                        C121547Gq.A01(this.A02, C86134wK.A0N("error_point", str4, 4, 1), this.A03);
                    }
                    if (r14 != null) {
                        AnonymousClass5Id ALA2 = r14.ALA(dcpContext);
                        if (ALA2.A02) {
                            A0v2.addAll((Collection) ALA2.A00);
                        } else {
                            String str5 = ALA2.A01;
                            if (str5 == null) {
                                str5 = "example_error";
                            }
                            C121547Gq.A01(this.A02, C86134wK.A0N("error_point", str5, 4, 1), this.A03);
                        }
                    }
                    if (C18250wR.A1K(A0v2)) {
                        HashMap A0y = AnonymousClass0wJ.A0y();
                        ArrayList A0w = AnonymousClass0wJ.A0w(A0v2);
                        for (FeatureData featureData : A0v2) {
                            A0w.add(C18180wK.A0p(featureData.A03, featureData));
                        }
                        AnonymousClass4WJ.A0J(A0w, A0y);
                        if (str3 == null) {
                            str3 = C18190wL.A0n(C03480Iw.A00());
                        }
                        if (dcpContext == null || (str = dcpContext.A01) == null) {
                            str = "";
                        }
                        A0v.add(new Example(new ExampleContext((Type) null, str, 30), str3, A0y));
                    }
                }
                KtCSuperShape1S2110000_I2 A0N = C86134wK.A0N("examples_extracted", String.valueOf(A0v.size()), 4, 0);
                C121547Gq r7 = this.A03;
                AnonymousClass68S r5 = this.A02;
                C121547Gq.A01(r5, A0N, r7);
                C121547Gq.A01(r5, C86134wK.A0N("example_extraction_complete", (String) null, 6, 1), r7);
                list2 = A0v;
            }
            if (!r3.BXK() && !r3.BZD()) {
                r1 = AnonymousClass0ZV.A00;
                str2 = "cannot train and cannot predict";
            } else if (list2.isEmpty()) {
                r1 = AnonymousClass0ZV.A00;
                str2 = "no examples extracted";
            } else {
                int size = list2.size();
                ArrayList A0k = C18240wQ.A0k(size);
                for (int i = 0; i < size; i++) {
                    A0k.add(Double.valueOf(-1.0d));
                }
                List list3 = A0k;
                if (r3.BXK()) {
                    AnonymousClass5Id CX6 = this.A06.CX6(this.A02, list2);
                    boolean z = CX6.A02;
                    if (!z) {
                        return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, CX6.A01, z);
                    }
                    list3 = (List) CX6.A00;
                }
                if (r3.BZD()) {
                    if (list2.size() != list3.size()) {
                        C121547Gq.A01(this.A02, C86134wK.A0N("example_size_dont_match_prediction", AnonymousClass00U.A01(list2.size(), list3.size(), "Example Size : ", " Prediction Size: "), 4, 1), this.A03);
                    } else {
                        C121547Gq.A01(this.A02, C86134wK.A0N("features storing started", (String) null, 6, 1), this.A03);
                        this.A05.execute(new AnonymousClass82G(this, list2, list3));
                    }
                }
                return AnonymousClass5Id.A00(AnonymousClass00J.A0T(list2, list3));
            }
        }
        return AnonymousClass5Id.A01(r1, str2, false);
    }

    public C125877eD(C145188k1 r2, C145788l5 r3, AnonymousClass68S r4, C121547Gq r5, C146918n5 r6, C147128nR r7, C86004w7 r8) {
        AnonymousClass0wJ.A1O(r6, r3);
        AnonymousClass0wJ.A1R(r2, r5);
        C04220Ms.A0B(r8, 5);
        C86104wH.A1P(r7, 6, r4);
        this.A06 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r8;
        this.A04 = r7;
        this.A02 = r4;
    }
}
