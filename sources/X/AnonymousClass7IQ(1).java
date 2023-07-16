package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: X.7IQ  reason: invalid class name */
public final class AnonymousClass7IQ {
    public int A00;
    public int A01;
    public List A02 = AnonymousClass0ZV.A00;
    public Map A03 = C18220wO.A0y();
    public Map A04 = C18220wO.A0y();
    public Map A05 = C18220wO.A0y();
    public Map A06 = C18220wO.A0y();
    public Map A07 = C18220wO.A0y();
    public Map A08 = C18220wO.A0y();
    public Set A09 = C86134wK.A0u();
    public final C121077Ea A0A;

    public final void A04(List list) {
        double d;
        double d2;
        String A0D;
        double d3;
        this.A06 = C18220wO.A0y();
        this.A05 = C18220wO.A0y();
        this.A08 = C18220wO.A0y();
        this.A09 = C86134wK.A0u();
        List<View> list2 = list;
        ArrayList A0x = AnonymousClass0wJ.A0x(list2, 10);
        for (View view : list2) {
            Rect rect = new Rect(0, 0, 0, 0);
            view.getGlobalVisibleRect(rect);
            AnonymousClass7IZ.A01();
            Object tag = view.getTag(-345497869);
            if (this.A0A.A08 && tag != null) {
                Number A0j = C86124wJ.A0j(tag.toString(), this.A06);
                if (A0j != null) {
                    d3 = A0j.doubleValue();
                } else {
                    d3 = 0.0d;
                }
                this.A06.put(tag.toString(), Double.valueOf(d3 + (((double) view.getHeight()) * ((double) view.getWidth()))));
            }
            AnonymousClass7IZ.A01();
            Object tag2 = view.getTag(-345497869);
            if (tag2 != null) {
                this.A09.add(tag2.toString());
                A0D = tag2.toString();
            } else {
                A0D = AnonymousClass00U.A0D(A01(view), '_', AnonymousClass7AM.A01.A01());
            }
            A0x.add(C18180wK.A0p(A0D, rect));
        }
        this.A02 = A0x;
        if (C18190wL.A1a(this.A09)) {
            C121077Ea r3 = this.A0A;
            if (r3.A05) {
                Set entrySet = this.A03.entrySet();
                C78134hw r0 = C78134hw.A00;
                C04220Ms.A0B(entrySet, 0);
                C000300e.A0t(entrySet, r0, false);
            }
            if (r3.A06) {
                LinkedHashMap A0y = C18220wO.A0y();
                for (Pair pair : this.A02) {
                    String str = (String) pair.A00;
                    Rect rect2 = (Rect) pair.A01;
                    LinkedHashMap A0y2 = C18220wO.A0y();
                    Iterator A0u = C18190wL.A0u(A0y);
                    while (A0u.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0u);
                        if (rect2.contains(A00(A0o))) {
                            C18210wN.A1Q(A0y2, A0o);
                        }
                    }
                    Iterator A0u2 = C18190wL.A0u(A0y2);
                    while (A0u2.hasNext()) {
                        A0y.remove(C18180wK.A0o(A0u2).getKey());
                    }
                    LinkedHashMap A0y3 = C18220wO.A0y();
                    Iterator A0u3 = C18190wL.A0u(A0y);
                    while (A0u3.hasNext()) {
                        Map.Entry A0o2 = C18180wK.A0o(A0u3);
                        if (rect2.intersect(A00(A0o2))) {
                            C18210wN.A1Q(A0y3, A0o2);
                        }
                    }
                    if (r3.A05) {
                        Iterator it = A0y2.values().iterator();
                        while (it.hasNext()) {
                            this.A03.put(AnonymousClass00U.A0d("full_cover//", C18180wK.A0k(it), "//", str), C18200wM.A0c());
                        }
                        Iterator it2 = A0y3.values().iterator();
                        while (it2.hasNext()) {
                            this.A03.put(AnonymousClass00U.A0d("partial_cover//", C18180wK.A0k(it2), "//", str), C18200wM.A0c());
                        }
                    }
                    Iterator A0u4 = C18190wL.A0u(A0y3);
                    while (A0u4.hasNext()) {
                        Map.Entry A0o3 = C18180wK.A0o(A0u4);
                        boolean z = true;
                        boolean A1W = C18230wP.A1W(A00(A0o3).left, rect2.left);
                        boolean A1X = C86134wK.A1X(A00(A0o3).right, rect2.right);
                        boolean A1W2 = C18230wP.A1W(A00(A0o3).top, rect2.top);
                        if (A00(A0o3).bottom <= rect2.bottom) {
                            z = false;
                        }
                        A0y.remove(A0o3.getKey());
                        if (A1W) {
                            C86144wL.A1P(C86164wN.A0F(A00(A0o3).left, Math.max(rect2.top, A00(A0o3).top), rect2.left, Math.min(rect2.bottom, ((Rect) A0o3.getKey()).bottom)), A0y, A0o3);
                        }
                        if (A1X) {
                            C86144wL.A1P(C86164wN.A0F(rect2.right, Math.max(rect2.top, A00(A0o3).top), A00(A0o3).right, Math.min(rect2.bottom, A00(A0o3).bottom)), A0y, A0o3);
                        }
                        if (A1W2) {
                            C86144wL.A1P(C86164wN.A0F(Math.max(rect2.left, A00(A0o3).left), A00(A0o3).top, Math.min(rect2.right, A00(A0o3).right), rect2.top), A0y, A0o3);
                        }
                        if (z) {
                            A03(A0y, A0o3, Math.max(rect2.left, A00(A0o3).left), rect2.bottom, Math.min(rect2.right, A00(A0o3).right));
                        }
                        if (A1W2) {
                            if (A1W) {
                                C86144wL.A1P(C86164wN.A0F(A00(A0o3).left, A00(A0o3).top, rect2.left, rect2.top), A0y, A0o3);
                            }
                            if (A1X) {
                                C86144wL.A1P(C86164wN.A0F(rect2.right, A00(A0o3).top, A00(A0o3).right, rect2.top), A0y, A0o3);
                            }
                        }
                        if (z) {
                            if (A1W) {
                                A03(A0y, A0o3, A00(A0o3).left, rect2.bottom, rect2.left);
                            }
                            if (A1X) {
                                A03(A0y, A0o3, rect2.right, rect2.bottom, A00(A0o3).right);
                            }
                        }
                    }
                    if (this.A09.contains(str)) {
                        A0y.put(rect2, str);
                    }
                }
                ArrayList A0k = C18240wQ.A0k(A0y.size());
                Iterator A0u5 = C18190wL.A0u(A0y);
                while (A0u5.hasNext()) {
                    Map.Entry A0o4 = C18180wK.A0o(A0u5);
                    A0k.add(C18180wK.A0p(A0o4.getValue(), A0o4.getKey()));
                }
                this.A02 = A0k;
            }
            if (r3.A08) {
                for (Pair pair2 : this.A02) {
                    Object obj = pair2.A00;
                    Rect rect3 = (Rect) pair2.A01;
                    if (this.A06.containsKey(obj)) {
                        Number A0j2 = C86124wJ.A0j(obj, this.A05);
                        if (A0j2 != null) {
                            d = A0j2.doubleValue();
                        } else {
                            d = 0.0d;
                        }
                        double height = d + (((double) rect3.height()) * ((double) rect3.width()));
                        this.A05.put(obj, Double.valueOf(height));
                        Map map = this.A08;
                        Number A0j3 = C86124wJ.A0j(obj, this.A06);
                        if (A0j3 != null) {
                            d2 = A0j3.doubleValue();
                        } else {
                            d2 = 100.0d;
                        }
                        map.put(obj, Double.valueOf(height / d2));
                    }
                }
            }
            for (Pair pair3 : this.A02) {
                String A022 = A02((String) pair3.A00);
                AnonymousClass0ZU r02 = (AnonymousClass0ZU) this.A07.get(A022);
                if (r02 != null) {
                    r02.invoke();
                    Map map2 = this.A07;
                    LinkedHashMap A0y4 = C18220wO.A0y();
                    Iterator A0z = AnonymousClass0wJ.A0z(map2);
                    while (A0z.hasNext()) {
                        Map.Entry A0o5 = C18180wK.A0o(A0z);
                        if (C86144wL.A1X(A02(C18200wM.A0p(A0o5)), A022)) {
                            C18210wN.A1Q(A0y4, A0o5);
                        }
                    }
                    this.A07 = C03940Lk.A02(A0y4);
                }
            }
            List<Pair> list3 = this.A02;
            ArrayList A0x2 = AnonymousClass0wJ.A0x(list3, 10);
            for (Pair pair4 : list3) {
                A0x2.add(pair4.A00);
            }
            Map map3 = this.A04;
            LinkedHashMap A0y5 = C18220wO.A0y();
            Iterator A0z2 = AnonymousClass0wJ.A0z(map3);
            while (A0z2.hasNext()) {
                Map.Entry A0o6 = C18180wK.A0o(A0z2);
                if (!A0x2.contains(A02(C18200wM.A0p(A0o6)))) {
                    C18210wN.A1Q(A0y5, A0o6);
                }
            }
            Iterator A0u6 = C18190wL.A0u(A0y5);
            while (A0u6.hasNext()) {
                Map.Entry A0o7 = C18180wK.A0o(A0u6);
                C18240wQ.A1G(A0o7.getValue());
                map3.remove(A02(C18200wM.A0p(A0o7)));
            }
            if (r3.A03 && r3.A04) {
                AnonymousClass7IZ.A00();
                if (AnonymousClass7IZ.A00 != null) {
                    LinkedHashMap A0y6 = C18220wO.A0y();
                    for (Pair pair5 : AnonymousClass7IZ.A01().A02) {
                        Object obj2 = pair5.A00;
                        AnonymousClass8bH A023 = AnonymousClass8bH.A02(30, 200);
                        AnonymousClass8bG r1 = AnonymousClass7AM.A00;
                        C86134wK.A1P(obj2, A0y6, Color.argb(180, AnonymousClass8bI.A05(r1, A023), AnonymousClass8bI.A05(r1, AnonymousClass8bH.A02(30, 200)), AnonymousClass8bI.A05(r1, AnonymousClass8bH.A02(30, 200))));
                    }
                    for (Pair pair6 : AnonymousClass7IZ.A01().A02) {
                        ViewGroup viewGroup = AnonymousClass7IZ.A00;
                        C04220Ms.A0C(viewGroup, "null cannot be cast to non-null type android.view.ViewGroup");
                        View view2 = new View(viewGroup.getContext());
                        Number number = (Number) A0y6.get(pair6.A00);
                        if (number != null) {
                            view2.setBackgroundColor(number.intValue());
                        }
                        Rect rect4 = (Rect) pair6.A01;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rect4.right - rect4.left, rect4.bottom - rect4.top);
                        layoutParams.setMargins(rect4.left, rect4.top, 0, 0);
                        ViewGroup viewGroup2 = AnonymousClass7IZ.A00;
                        C04220Ms.A0C(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewGroup2.addView(view2, layoutParams);
                        AnonymousClass7IZ.A04.add(view2);
                    }
                }
            }
        }
    }

    public static final String A01(View view) {
        String str;
        Context context;
        Context applicationContext;
        Resources resources;
        try {
            ViewGroup viewGroup = AnonymousClass7IZ.A00;
            if (viewGroup == null || (context = viewGroup.getContext()) == null || (applicationContext = context.getApplicationContext()) == null || (resources = applicationContext.getResources()) == null) {
                str = null;
            } else {
                str = resources.getResourceName(view.getId());
            }
            return String.valueOf(str);
        } catch (Resources.NotFoundException unused) {
            return "NO_ID";
        }
    }

    public static final String A02(String str) {
        List A072 = C81074n3.A07(str, "///", 0);
        if (!A072.isEmpty()) {
            return C18190wL.A0p(A072, 0);
        }
        return str;
    }

    public AnonymousClass7IQ(C121077Ea r2) {
        this.A0A = r2;
    }

    public static Rect A00(Map.Entry entry) {
        return (Rect) entry.getKey();
    }

    public static void A03(AbstractMap abstractMap, Map.Entry entry, int i, int i2, int i3) {
        abstractMap.put(new Rect(i, i2, i3, ((Rect) entry.getKey()).bottom), entry.getValue());
    }
}
