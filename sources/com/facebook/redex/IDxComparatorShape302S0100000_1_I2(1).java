package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass19W;
import X.AnonymousClass3CV;
import X.AnonymousClass722;
import X.BKU;
import X.C04220Ms;
import X.C31103Gfm;
import X.C61723Vc;
import X.C62733ac;
import X.JIS;
import android.content.Context;
import android.content.pm.ResolveInfo;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;
import com.instagram.user.model.User;
import java.text.Collator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class IDxComparatorShape302S0100000_1_I2 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape302S0100000_1_I2(int i, Comparator comparator) {
        this.A01 = i;
        switch (i) {
            case 6:
            case 7:
            case 8:
                this.A00 = comparator;
                return;
            default:
                this.A00 = comparator;
                return;
        }
    }

    public final int compare(Object obj, Object obj2) {
        Long l;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                Map map = (Map) this.A00;
                return AnonymousClass722.A00((Integer) map.get(((CameraAREffect) obj).A0I), (Integer) map.get(((CameraAREffect) obj2).A0I));
            case 1:
                BKU bku = (BKU) obj;
                List list = (List) this.A00;
                Iterator it = list.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!C04220Ms.A0I(it.next(), bku.A0N)) {
                        i3++;
                    }
                }
                Integer valueOf = Integer.valueOf(i3);
                BKU bku2 = (BKU) obj2;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C04220Ms.A0I(it2.next(), bku2.A0N)) {
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                return AnonymousClass722.A00(valueOf, Integer.valueOf(i));
            case 2:
                JIS jis = (JIS) obj2;
                String str2 = ((JIS) obj).A02;
                if (str2 == null || (str = jis.A02) == null) {
                    return 0;
                }
                return str2.compareTo(str);
            case 3:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                ResolveInfo resolveInfo2 = (ResolveInfo) obj2;
                boolean z = resolveInfo.isDefault;
                boolean z2 = resolveInfo2.isDefault;
                if (z == z2) {
                    List list2 = (List) this.A00;
                    return list2.indexOf(resolveInfo2.resolvePackageName) - list2.indexOf(resolveInfo.resolvePackageName);
                } else if (z2 == z) {
                    return 0;
                } else {
                    if (z2) {
                        return 1;
                    }
                    return -1;
                }
            case 4:
                Context context = (Context) this.A00;
                AnonymousClass19W r8 = (AnonymousClass19W) obj;
                AnonymousClass19W r9 = (AnonymousClass19W) obj2;
                if (r8.equals(r9)) {
                    return 0;
                }
                Locale locale = r8.A03;
                Locale locale2 = Locale.US;
                if (locale.equals(locale2)) {
                    return -1;
                }
                if (!r9.A03.equals(locale2)) {
                    return context.getString(r8.A01).compareTo(context.getString(r9.A01));
                }
                return 1;
            case 5:
                AnonymousClass0YY r0 = (AnonymousClass0YY) this.A00;
                return AnonymousClass722.A00((Integer) r0.invoke(obj), (Integer) r0.invoke(obj2));
            case 8:
                Comparator comparator = (Comparator) this.A00;
                FBCommentImpl fBCommentImpl = ((C61723Vc) obj).A05;
                Long l2 = null;
                if (fBCommentImpl != null) {
                    l = Long.valueOf(fBCommentImpl.getTimeValue("created_time"));
                } else {
                    l = null;
                }
                FBCommentImpl fBCommentImpl2 = ((C61723Vc) obj2).A05;
                if (fBCommentImpl2 != null) {
                    l2 = Long.valueOf(fBCommentImpl2.getTimeValue("created_time"));
                }
                return comparator.compare(l, l2);
            case 9:
                C62733ac r82 = (C62733ac) obj;
                C62733ac r92 = (C62733ac) obj2;
                AnonymousClass0wJ.A1N(r82, r92);
                String str3 = r82.A06;
                C04220Ms.A06(str3);
                String str4 = r92.A06;
                C04220Ms.A06(str4);
                return ((Collator) this.A00).compare(str3, str4);
            case 10:
                return ((Collator) this.A00).compare(((User) obj).Ak2(), ((User) obj2).Ak2());
            case 11:
                Comparator comparator2 = (Comparator) this.A00;
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 != null) {
                    return comparator2.compare(obj, obj2);
                }
                return -1;
            default:
                return ((Comparator) this.A00).compare(((AnonymousClass3CV) obj).A02, ((AnonymousClass3CV) obj2).A02);
        }
    }

    public IDxComparatorShape302S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public IDxComparatorShape302S0100000_1_I2() {
        this.A01 = 9;
        this.A00 = Collator.getInstance(C31103Gfm.A02());
    }
}
