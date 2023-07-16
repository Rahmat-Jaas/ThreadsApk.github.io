package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ix  reason: invalid class name and case insensitive filesystem */
public abstract class C58973Ix {
    public Integer A00 = AnonymousClass006.A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3 = new fxcache.model.FxCalAccountLinkageInfo(X.AnonymousClass0ZV.A00, 0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fxcache.model.FxCalAccountLinkageInfo A01() {
        /*
            r5 = this;
            r4 = r5
            X.1z7 r4 = (X.C29691z7) r4
            monitor-enter(r4)
            boolean r0 = r4.A09()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0014
            X.0ZV r2 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x003f }
            r0 = 0
            fxcache.model.FxCalAccountLinkageInfo r3 = new fxcache.model.FxCalAccountLinkageInfo     // Catch:{ all -> 0x003f }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0014:
            com.instagram.service.session.UserSession r0 = r4.A04     // Catch:{ IOException -> 0x0034 }
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)     // Catch:{ IOException -> 0x0034 }
            X.0dK r0 = r0.A04     // Catch:{ IOException -> 0x0034 }
            java.lang.String r0 = X.C18200wM.A0j(r0)     // Catch:{ IOException -> 0x0034 }
            X.MMo r0 = X.C18180wK.A0L(r0)     // Catch:{ IOException -> 0x0034 }
            fxcache.model.FxCalAccountLinkageInfo r3 = X.C54622zk.parseFromJson(r0)     // Catch:{ IOException -> 0x0034 }
            if (r3 != 0) goto L_0x003d
            X.0ZV r2 = X.AnonymousClass0ZV.A00     // Catch:{ IOException -> 0x0034 }
            r0 = 0
            fxcache.model.FxCalAccountLinkageInfo r3 = new fxcache.model.FxCalAccountLinkageInfo     // Catch:{ IOException -> 0x0034 }
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x0034 }
            goto L_0x003d
        L_0x0034:
            X.0ZV r2 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x003f }
            r0 = 0
            fxcache.model.FxCalAccountLinkageInfo r3 = new fxcache.model.FxCalAccountLinkageInfo     // Catch:{ all -> 0x003f }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return r3
        L_0x003f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58973Ix.A01():fxcache.model.FxCalAccountLinkageInfo");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = new fxcache.model.FxCalAccountLinkageInfoForSwitcher(X.AnonymousClass0ZV.A00, 0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fxcache.model.FxCalAccountLinkageInfoForSwitcher A02() {
        /*
            r5 = this;
            r4 = r5
            X.1z7 r4 = (X.C29691z7) r4
            monitor-enter(r4)
            boolean r0 = r4.A09()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0034
            com.instagram.service.session.UserSession r0 = r4.A04     // Catch:{ IOException -> 0x002a }
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)     // Catch:{ IOException -> 0x002a }
            X.0dK r0 = r0.A05     // Catch:{ IOException -> 0x002a }
            java.lang.String r0 = X.C18200wM.A0j(r0)     // Catch:{ IOException -> 0x002a }
            X.MMo r0 = X.C18180wK.A0L(r0)     // Catch:{ IOException -> 0x002a }
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r3 = X.C54612zj.parseFromJson(r0)     // Catch:{ IOException -> 0x002a }
            if (r3 != 0) goto L_0x003d
            X.0ZV r2 = X.AnonymousClass0ZV.A00     // Catch:{ IOException -> 0x002a }
            r0 = 0
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r3 = new fxcache.model.FxCalAccountLinkageInfoForSwitcher     // Catch:{ IOException -> 0x002a }
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x002a }
            goto L_0x003d
        L_0x002a:
            X.0ZV r2 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x003f }
            r0 = 0
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r3 = new fxcache.model.FxCalAccountLinkageInfoForSwitcher     // Catch:{ all -> 0x003f }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0034:
            X.0ZV r2 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x003f }
            r0 = 0
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r3 = new fxcache.model.FxCalAccountLinkageInfoForSwitcher     // Catch:{ all -> 0x003f }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return r3
        L_0x003f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58973Ix.A02():fxcache.model.FxCalAccountLinkageInfoForSwitcher");
    }

    public final List A03(CallerContext callerContext, String str, String str2) {
        String str3 = str2;
        C04220Ms.A0B(str3, 2);
        C29691z7 r3 = (C29691z7) this;
        AnonymousClass49V r2 = r3.A03;
        String str4 = callerContext.A02;
        C04220Ms.A06(str4);
        String str5 = str;
        r2.A02(str5, str4);
        if (!A0C(str5)) {
            r2.A01(str5, str4);
            return AnonymousClass0ZV.A00;
        }
        A04();
        A05();
        A06();
        boolean A0D = A0D(str5);
        List list = r3.A00.A01;
        ArrayList<FxCalAccount> A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            if (((FxCalAccount) next).A02.equalsIgnoreCase(str3)) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        for (FxCalAccount fxCalAccount : A0v) {
            String str6 = fxCalAccount.A01;
            if (A0D) {
                str6 = "";
            }
            String str7 = fxCalAccount.A03;
            if (A0D || str7 == null) {
                str7 = "";
            }
            A0w.add(new FxCalAccount(fxCalAccount.A00, str6, str7, fxCalAccount.A02, fxCalAccount.A04, fxCalAccount.A06, fxCalAccount.A07, fxCalAccount.A05));
        }
        return A0w;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A04() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A0A()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            r5 = r6
            X.1z7 r5 = (X.C29691z7) r5     // Catch:{ all -> 0x004c }
            X.49V r3 = r5.A03     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "ig_android_linking_cache_fx_internal"
            java.lang.String r1 = "cache_eviction"
            r0 = 0
            r3.A04(r1, r2, r0, r0)     // Catch:{ all -> 0x004c }
            monitor-enter(r5)     // Catch:{ all -> 0x004c }
            boolean r0 = r5.A09()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x002a
            fxcache.model.FxCalAccountLinkageInfo r4 = r5.A00     // Catch:{ all -> 0x0047 }
            monitor-enter(r4)     // Catch:{ all -> 0x0047 }
            X.0ZV r3 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x0044 }
            r1 = 0
            fxcache.model.FxCalAccountLinkageInfo r0 = new fxcache.model.FxCalAccountLinkageInfo     // Catch:{ all -> 0x0044 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0044 }
            r5.A00 = r0     // Catch:{ all -> 0x0044 }
            goto L_0x003e
        L_0x002a:
            com.instagram.service.session.UserSession r0 = r5.A04     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A03(r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "fx_account_center_info"
            X.C18180wK.A0u(r1, r0)     // Catch:{ all -> 0x0047 }
            fxcache.model.FxCalAccountLinkageInfo r4 = r5.A00     // Catch:{ all -> 0x0047 }
            monitor-enter(r4)     // Catch:{ all -> 0x0047 }
            fxcache.model.FxCalAccountLinkageInfo r0 = r5.A01()     // Catch:{ all -> 0x0041 }
            r5.A00 = r0     // Catch:{ all -> 0x0041 }
        L_0x003e:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r6)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58973Ix.A04():void");
    }

    public final synchronized void A05() {
        synchronized (this) {
            if (A0B() && A09()) {
                C29691z7 r4 = (C29691z7) this;
                r4.A03.A04("cache_eviction", FXPFLinkageCacheDebugFragment.callerName, (List) null, (Map) null);
                if (r4.A09()) {
                    C18180wK.A0u(C28161tl.A03(r4.A04), "fx_linkage_cache_switcher");
                    synchronized (r4.A01) {
                        r4.A01 = r4.A02();
                    }
                }
            }
        }
    }

    public final synchronized void A06() {
        long j;
        boolean A0A;
        Integer num;
        if (A09()) {
            j = ((C29691z7) this).A01.A00;
        } else {
            j = ((C29691z7) this).A00.A00;
        }
        if (A09()) {
            A0A = A0B();
        } else {
            A0A = A0A();
        }
        if (AnonymousClass006.A00 != this.A00 || j > 0) {
            if (A0A) {
                num = AnonymousClass006.A0C;
            } else {
                num = AnonymousClass006.A01;
            }
            this.A00 = num;
        }
    }

    public final boolean A0C(String str) {
        C04220Ms.A0B(str, 0);
        if (AnonymousClass0wJ.A1X(C18200wM.A0e())) {
            return C54732zv.A00(AnonymousClass006.A01, C18210wN.A0a(), str);
        } else if (!AnonymousClass0wJ.A1X(C08960ea.A00(18301199245707919L).A01())) {
            return true;
        } else {
            String str2 = (String) C08960ea.A00(18864149199192222L).A01();
            if (str2 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = new JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        }
    }

    public final boolean A0D(String str) {
        String str2;
        C04220Ms.A0B(str, 0);
        if (!AnonymousClass0wJ.A1X(C18200wM.A0e())) {
            return false;
        }
        try {
            JSONObject jSONObject = C18250wR.A0j(C18210wN.A0a()).getJSONObject(String.valueOf(1)).getJSONObject(String.valueOf(((C313925w) C313925w.A02.get(str)).A00));
            String valueOf = String.valueOf(3);
            if (!jSONObject.has(valueOf) || jSONObject.getJSONArray(valueOf).getInt(0) != 0) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            e = e;
            str2 = "NullPointerException";
            AnonymousClass0LU.A0E("AccessControlRuleV2", str2, e);
            return false;
        } catch (JSONException e2) {
            AnonymousClass0LU.A0E("AccessControlRuleV2", "JSONException", e2);
            return false;
        } catch (Exception e3) {
            e = e3;
            str2 = "Exception";
            AnonymousClass0LU.A0E("AccessControlRuleV2", str2, e);
            return false;
        }
    }

    public final boolean A09() {
        return C63173fJ.A05(AnonymousClass0TJ.A05, 18312967456106486L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((!r1.equalsIgnoreCase(r2)) != false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.facebook.common.callercontext.CallerContext r12, fxcache.model.FxCalAccountLinkageInfo r13, java.lang.String r14) {
        /*
            r11 = this;
            boolean r5 = X.AnonymousClass0wJ.A1Y(r14, r12)
            r4 = r11
            boolean r0 = r11.A09()
            if (r0 != 0) goto L_0x00fc
            r3 = r4
            X.1z7 r3 = (X.C29691z7) r3
            monitor-enter(r3)
            java.lang.String r2 = X.C29691z7.A00(r13)     // Catch:{ all -> 0x00f4 }
            fxcache.model.FxCalAccountLinkageInfo r0 = r3.A00     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = X.C29691z7.A00(r0)     // Catch:{ all -> 0x00f4 }
            boolean r0 = X.AnonymousClass0hA.A08(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x0022
            r1 = r10
        L_0x0022:
            boolean r0 = X.AnonymousClass0hA.A08(r2)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x0029
            r2 = r10
        L_0x0029:
            if (r1 != 0) goto L_0x002e
            if (r2 != 0) goto L_0x0036
            goto L_0x005d
        L_0x002e:
            boolean r0 = r1.equalsIgnoreCase(r2)     // Catch:{ all -> 0x00f4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005d
        L_0x0036:
            com.instagram.service.session.UserSession r6 = r3.A04     // Catch:{ all -> 0x00f4 }
            X.KHq r1 = X.AnonymousClass3LY.A00(r6)     // Catch:{ all -> 0x00f4 }
            X.45o r0 = new X.45o     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            r1.CWx(r0)     // Catch:{ all -> 0x00f4 }
            X.0TJ r2 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x00f4 }
            r0 = 36312084471874388(0x8101a600000354, double:3.0272466648167805E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x005d
            X.KHq r1 = X.AnonymousClass3LY.A00(r6)     // Catch:{ all -> 0x00f4 }
            X.45n r0 = new X.45n     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            r1.CWx(r0)     // Catch:{ all -> 0x00f4 }
        L_0x005d:
            boolean r0 = r3.A09()     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00f7
            com.instagram.service.session.UserSession r0 = r3.A04     // Catch:{ all -> 0x00f4 }
            X.1tl r7 = X.AnonymousClass3WS.A01(r0)     // Catch:{ all -> 0x00f4 }
            java.io.StringWriter r8 = X.C18230wP.A0d()     // Catch:{ IOException -> 0x00ea }
            X.MMp r6 = X.C18180wK.A0K(r8)     // Catch:{ IOException -> 0x00ea }
            java.lang.String r0 = "accounts"
            r6.A0U(r0)     // Catch:{ IOException -> 0x00ea }
            r6.A0I()     // Catch:{ IOException -> 0x00ea }
            java.util.List r0 = r13.A01     // Catch:{ IOException -> 0x00ea }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ IOException -> 0x00ea }
        L_0x007f:
            boolean r0 = r9.hasNext()     // Catch:{ IOException -> 0x00ea }
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r2 = r9.next()     // Catch:{ IOException -> 0x00ea }
            fxcache.model.FxCalAccount r2 = (fxcache.model.FxCalAccount) r2     // Catch:{ IOException -> 0x00ea }
            if (r2 == 0) goto L_0x007f
            r6.A0J()     // Catch:{ IOException -> 0x00ea }
            java.lang.String r1 = r2.A01     // Catch:{ IOException -> 0x00ea }
            java.lang.String r0 = "account_id"
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
            java.lang.String r1 = r2.A03     // Catch:{ IOException -> 0x00ea }
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "instagram_id"
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
        L_0x00a0:
            java.lang.String r1 = r2.A02     // Catch:{ IOException -> 0x00ea }
            java.lang.String r0 = "account_type"
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
            java.lang.String r1 = r2.A04     // Catch:{ IOException -> 0x00ea }
            if (r1 == 0) goto L_0x00b0
            java.lang.String r0 = "account_name"
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
        L_0x00b0:
            java.lang.String r1 = r2.A06     // Catch:{ IOException -> 0x00ea }
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "profile_picture_url"
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
        L_0x00b9:
            java.lang.String r1 = r2.A07     // Catch:{ IOException -> 0x00ea }
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = X.C61963Wn.A00()     // Catch:{ IOException -> 0x00ea }
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
        L_0x00c4:
            java.lang.String r1 = r2.A05     // Catch:{ IOException -> 0x00ea }
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = "obfuscated_id"
            r6.A0d(r0, r1)     // Catch:{ IOException -> 0x00ea }
        L_0x00cd:
            int r1 = r2.A00     // Catch:{ IOException -> 0x00ea }
            java.lang.String r0 = "badge_count"
            r6.A0b(r0, r1)     // Catch:{ IOException -> 0x00ea }
            r6.A0G()     // Catch:{ IOException -> 0x00ea }
            goto L_0x007f
        L_0x00d8:
            r6.A0F()     // Catch:{ IOException -> 0x00ea }
            long r1 = r13.A00     // Catch:{ IOException -> 0x00ea }
            java.lang.String r0 = "last_update_time_ms"
            r6.A0c(r0, r1)     // Catch:{ IOException -> 0x00ea }
            java.lang.String r1 = X.C18180wK.A0h(r6, r8)     // Catch:{ IOException -> 0x00ea }
            X.C04220Ms.A06(r1)     // Catch:{ IOException -> 0x00ea }
            goto L_0x00eb
        L_0x00ea:
            r1 = r10
        L_0x00eb:
            X.C04220Ms.A0B(r1, r5)     // Catch:{ all -> 0x00f4 }
            X.0dK r0 = r7.A04     // Catch:{ all -> 0x00f4 }
            X.C18240wQ.A1D(r0, r1)     // Catch:{ all -> 0x00f4 }
            goto L_0x00f7
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00f7:
            monitor-exit(r3)
            fxcache.model.FxCalAccountLinkageInfo r13 = r11.A01()
        L_0x00fc:
            X.1z7 r4 = (X.C29691z7) r4
            fxcache.model.FxCalAccountLinkageInfo r1 = r4.A00
            monitor-enter(r1)
            r4.A00 = r13     // Catch:{ all -> 0x011b }
            monitor-exit(r1)
            r11.A06()
            X.49V r3 = r4.A03
            java.lang.String r1 = r12.A02
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "caller_class"
            java.util.HashMap r2 = X.C63203gz.A03(r0, r1)
            java.lang.String r1 = "cache_write"
            r0 = 0
            r3.A04(r1, r14, r0, r2)
            return
        L_0x011b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58973Ix.A07(com.facebook.common.callercontext.CallerContext, fxcache.model.FxCalAccountLinkageInfo, java.lang.String):void");
    }

    public final void A08(CallerContext callerContext, FxCalAccountLinkageInfoForSwitcher fxCalAccountLinkageInfoForSwitcher, String str) {
        String str2;
        boolean A1Y = AnonymousClass0wJ.A1Y(str, callerContext);
        if (A09()) {
            C29691z7 r3 = (C29691z7) this;
            synchronized (r3) {
                if (r3.A09()) {
                    C28161tl A01 = AnonymousClass3WS.A01(r3.A04);
                    try {
                        StringWriter A0d = C18230wP.A0d();
                        MMp A0K = C18180wK.A0K(A0d);
                        A0K.A0U("accounts");
                        A0K.A0I();
                        for (FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo : fxCalAccountLinkageInfoForSwitcher.A01) {
                            if (fxCalAccountWithSwitcherInfo != null) {
                                A0K.A0J();
                                A0K.A0d("account_id", fxCalAccountWithSwitcherInfo.A01);
                                String str3 = fxCalAccountWithSwitcherInfo.A03;
                                if (str3 != null) {
                                    A0K.A0d("instagram_id", str3);
                                }
                                A0K.A0d("account_type", fxCalAccountWithSwitcherInfo.A02);
                                String str4 = fxCalAccountWithSwitcherInfo.A04;
                                if (str4 != null) {
                                    A0K.A0d("account_name", str4);
                                }
                                String str5 = fxCalAccountWithSwitcherInfo.A06;
                                if (str5 != null) {
                                    A0K.A0d("profile_picture_url", str5);
                                }
                                String str6 = fxCalAccountWithSwitcherInfo.A07;
                                if (str6 != null) {
                                    A0K.A0d(C61963Wn.A00(), str6);
                                }
                                String str7 = fxCalAccountWithSwitcherInfo.A05;
                                if (str7 != null) {
                                    A0K.A0d("obfuscated_id", str7);
                                }
                                A0K.A0b("badge_count", fxCalAccountWithSwitcherInfo.A00);
                                A0K.A0G();
                            }
                        }
                        A0K.A0F();
                        A0K.A0c("last_update_time_ms", fxCalAccountLinkageInfoForSwitcher.A00);
                        str2 = C18180wK.A0h(A0K, A0d);
                        C04220Ms.A06(str2);
                    } catch (IOException unused) {
                        str2 = "";
                    }
                    C04220Ms.A0B(str2, A1Y ? 1 : 0);
                    C18240wQ.A1D(A01.A05, str2);
                }
            }
            synchronized (r3.A01) {
                r3.A01 = A02();
            }
            A06();
            AnonymousClass49V r32 = r3.A03;
            String str8 = callerContext.A02;
            C04220Ms.A06(str8);
            r32.A04("cache_write", str, (List) null, C63203gz.A03("caller_class", str8));
        }
    }

    public final boolean A0A() {
        long j;
        boolean A09 = A09();
        long currentTimeMillis = System.currentTimeMillis() - ((C29691z7) this).A00.A00;
        if (A09) {
            j = C18220wO.A09(561600);
        } else {
            j = 86400000;
        }
        if (currentTimeMillis <= j) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        long j;
        boolean A09 = A09();
        long currentTimeMillis = System.currentTimeMillis();
        C29691z7 r0 = (C29691z7) this;
        if (A09) {
            j = r0.A01.A00;
        } else {
            j = r0.A00.A00;
        }
        if (currentTimeMillis - j <= 86400000) {
            return false;
        }
        return true;
    }
}
