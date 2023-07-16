package X;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7SP  reason: invalid class name */
public final class AnonymousClass7SP implements C142618fJ {
    public final /* synthetic */ C128277jJ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public AnonymousClass7SP(C128277jJ r1, String str, String str2, String str3, List list) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = list;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C113806sA r11 = (C113806sA) obj;
        this.A00.A00.getValue();
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        List list = this.A04;
        try {
            C126337ez r4 = (C126337ez) C86104wH.A0p("create", C116616xG.class);
            C67463zb r3 = r4.A00;
            r3.A05("interface_type", "IG_ANDROID");
            r4.A02 = true;
            r3.A05("fe_id", str);
            r3.A05(AnonymousClass3QB.A00(9, 10, 62), str2);
            r3.A05("view_name", str3);
            r3.A06("subtypes_to_filter", ImmutableList.copyOf((Collection) list));
            C146418mD build = r4.build();
            C04220Ms.A06(build);
            return AnonymousClass6BW.A00(r11, C1370385p.A00(), build, AnonymousClass7nI.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
