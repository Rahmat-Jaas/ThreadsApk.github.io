package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Ym  reason: invalid class name and case insensitive filesystem */
public final class C22541Ym extends C34640IcN {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridPassingNativeValueIntoBloksFragment";
    public FrameLayout A00;
    public C130667qT A01;
    public C121247Ez A02;
    public UserSession A03;
    public String A04;
    public Button A05;
    public TextView A06;
    public C30938GbW A07;

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_passing_native_value_into_bloks_example";
    }

    public static void A00(C22541Ym r6) {
        String str = "A";
        if (r6.A04.equals(str)) {
            str = "B";
        }
        r6.A04 = str;
        r6.A06.setText(str);
        if (r6.A02 != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("abc", r6.A04);
            C121247Ez r62 = r6.A02;
            if (r62.A04.get()) {
                C30967GcS.A02("BloksHostingComponent", "Trying to update variables on a destroyed BloksHostingComponent");
                return;
            }
            boolean z = false;
            Map A042 = C121997Jj.A04(r62.A03, A0y);
            Map map = r62.A01;
            Iterator A0z = AnonymousClass0wJ.A0z(A042);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object key = A0o.getKey();
                Object value = A0o.getValue();
                if (r62.A01.get(key) != value) {
                    Map map2 = r62.A01;
                    if (map == map2) {
                        z = true;
                        map = new HashMap(map2);
                    }
                    map.put(key, value);
                }
            }
            if (z) {
                r62.A01 = map;
                C121247Ez.A01(r62, (C113616ro) r62.A05.get());
            }
        }
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(162798144);
        super.onCreate(bundle);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A03 = A0V;
        this.A04 = "A";
        C30938GbW A002 = C29781Fu1.A00();
        this.A07 = A002;
        this.A01 = C130667qT.A01(this, this, A0V, A002);
        C14030oh.A09(385378890, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(267554272);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.passing_native_value_into_bloks_example);
        this.A06 = C18180wK.A0G(A0H, R.id.native_value);
        Button button = (Button) A0H.requireViewById(R.id.button);
        this.A05 = button;
        AnonymousClass0wJ.A16(button, 61, this);
        this.A00 = (FrameLayout) A0H.findViewById(R.id.bloks_view);
        C145538kf r3 = this.A01.A07;
        AnonymousClass4A9 A012 = C63263h8.A01(this.A03, "com.instagram.bloks_native_hybrid_shell.passing_native_value_into_bloks", (Map) null);
        A012.A00 = new AnonymousClass1eU(this);
        r3.schedule(A012);
        A00(this);
        C14030oh.A09(-1608271207, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1515858052);
        super.onDestroyView();
        this.A02.A04();
        C14030oh.A09(921932853, A022);
    }
}
