package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.7eI  reason: invalid class name and case insensitive filesystem */
public final class C125927eI implements C146918n5 {
    public final C121547Gq A00;
    public final C1193174m A01;
    public final C108746is A02;
    public final C147128nR A03;

    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v4 */
    public final AnonymousClass5Id CX6(AnonymousClass68S r21, List list) {
        ? r5;
        AnonymousClass5Id A012;
        AnonymousClass5Id r11;
        C143308gV r1;
        AnonymousClass0ZV r14;
        String str;
        IValue[] tuple;
        IValue iValue;
        Tensor tensor;
        AnonymousClass68S r8 = r21;
        C04220Ms.A0B(r8, 1);
        try {
            C147128nR r4 = this.A03;
            KtCSuperShape1S2110000_I2 A0N = C86134wK.A0N("model_name", r4.AwE(), 4, 0);
            C121547Gq r7 = this.A00;
            r7.A02(r8, A0N, "no_use_case");
            r7.A02(r8, C86134wK.A0N("model_version", String.valueOf(r4.AwF()), 4, 0), "no_use_case");
            r7.A02(r8, C86134wK.A0N("model_asset_name", r4.Aw7(), 4, 0), "no_use_case");
            C108746is r12 = this.A02;
            C1200878l r52 = r12.A01;
            String A002 = C98766Gv.A00(r4);
            String str2 = "";
            C04220Ms.A0B(A002, 0);
            String string = r52.A00.getString(C1200878l.A00(r52, A002), str2);
            if (string != null) {
                str2 = string;
            }
            if (str2.length() == 0) {
                r5 = 0;
                A012 = AnonymousClass5Id.A01((Object) null, AnonymousClass00U.A0L("Model file is not found for ", C98766Gv.A00(r4)), false);
            } else {
                C98766Gv.A00(r4);
                r5 = 0;
                C37200JmN.A00();
                r12.A00.A02(r8, C86134wK.A0N("voltron_module_loaded_locally", (String) null, 6, 1), "no_use_case");
                try {
                    A012 = AnonymousClass5Id.A01(DHL.A00(str2), (String) null, true);
                } catch (Exception e) {
                    A012 = AnonymousClass5Id.A01((Object) null, e.getMessage(), false);
                }
            }
            r7.A02(r8, C86134wK.A0N("loaded_model_path", (String) null, 6, 1), "no_use_case");
            C25322Dji dji = (C25322Dji) A012.A00;
            boolean z = A012.A02;
            if (!z || dji == null) {
                return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, A012.A01, z);
            }
            try {
                C1193174m r13 = this.A01;
                AnonymousClass5KE r0 = new AnonymousClass5KE((String) null, (DefaultConstructorMarker) null, 1);
                C121547Gq r10 = r13.A00;
                AnonymousClass68S r3 = AnonymousClass68S.USER_PREDICT;
                r10.A02(r3, r0, "no_use_case");
                List list2 = list;
                try {
                    if (list2.isEmpty()) {
                        r11 = AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "no examples", false);
                    } else {
                        C145668kt r122 = dji.A00;
                        long[] longList = r122.runMethod("get_feature_list", new IValue[0]).toLongList();
                        C04220Ms.A06(longList);
                        ArrayList A0k = C18240wQ.A0k(r18);
                        for (long valueOf : longList) {
                            A0k.add(String.valueOf(valueOf));
                        }
                        C1193174m.A00(r13, "prepare_features");
                        AnonymousClass79Q A003 = C98686Gn.A00(list2, A0k);
                        C1193174m.A00(r13, "transform_features");
                        Map dictStringKey = r122.forward(AnonymousClass79Q.A00(A003)).toDictStringKey();
                        C1193174m.A00(r13, "run_inference");
                        C04220Ms.A06(dictStringKey);
                        if (!dictStringKey.containsKey("prediction")) {
                            r14 = AnonymousClass0ZV.A00;
                            str = "result does not contain key prediction";
                        } else {
                            IValue iValue2 = (IValue) dictStringKey.get("prediction");
                            if (!(iValue2 == null || (tuple = iValue2.toTuple()) == null || (iValue = tuple[0]) == null || (tensor = iValue.toTensor()) == null)) {
                                List<Object> A08 = AnonymousClass8AP.A08(tensor.getDataAsFloatArray());
                                if (!A08.isEmpty()) {
                                    r10.A02(r3, new KtCSuperShape1S2110000_I2("convert_result_to_float_arr", A08.toString(), 1, true), "no_use_case");
                                    if (A08.size() != list2.size()) {
                                        r14 = AnonymousClass0ZV.A00;
                                        str = AnonymousClass00U.A01(list2.size(), A08.size(), "examples count: ", ", results count: ");
                                    } else {
                                        ArrayList A0w = AnonymousClass0wJ.A0w(A08);
                                        for (Object A004 : A08) {
                                            A0w.add(Double.valueOf((double) C18240wQ.A00(A004)));
                                        }
                                        r11 = AnonymousClass5Id.A01(A0w, (String) null, true);
                                    }
                                }
                            }
                            r14 = AnonymousClass0ZV.A00;
                            str = "no results";
                        }
                        r11 = AnonymousClass5Id.A01(r14, str, false);
                    }
                } catch (Exception e2) {
                    r11 = AnonymousClass5Id.A01(AnonymousClass0ZV.A00, e2.getMessage(), false);
                }
                if (r11.A02) {
                    r1 = new AnonymousClass5KF(r5, 0, 1);
                } else {
                    String str3 = r11.A01;
                    if (str3 == null) {
                        str3 = "predictor internal failed";
                    }
                    r1 = new AnonymousClass5KB(new AnonymousClass6CM(str3), r5);
                }
                r10.A02(r3, r1, "no_use_case");
                r7.A02(r8, C86134wK.A0N("predicted", r5, 6, 1), "no_use_case");
                return r11;
            } catch (Exception e3) {
                return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, e3.getMessage(), false);
            }
        } catch (Exception e4) {
            return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, e4.getMessage(), false);
        }
    }

    public C125927eI(C121547Gq r1, C1193174m r2, C108746is r3, C147128nR r4) {
        AnonymousClass0wJ.A1O(r4, r2);
        AnonymousClass0wJ.A1R(r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
