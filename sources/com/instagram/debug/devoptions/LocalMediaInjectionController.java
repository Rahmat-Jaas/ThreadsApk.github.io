package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C09120et;
import android.content.Context;

public final class LocalMediaInjectionController {
    public final C09120et devPreferences;

    public LocalMediaInjectionController(Context context) {
        C04220Ms.A0B(context, 1);
        this.devPreferences = C09120et.A3D.A01(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return (java.util.Set) X.C18220wO.A0f(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set getSelectedInjectionItems(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -2059491644: goto L_0x0011;
                case -1611522806: goto L_0x001f;
                case -532323585: goto L_0x002d;
                case -334510404: goto L_0x00a4;
                case -332904891: goto L_0x00b1;
                case -191590769: goto L_0x00be;
                case 704169745: goto L_0x00cb;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0011:
            java.lang.String r0 = "stories_ads"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0et r0 = r2.devPreferences
            X.0dK r0 = r0.A1E
            goto L_0x00d7
        L_0x001f:
            java.lang.String r0 = "reels_ads"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0et r0 = r2.devPreferences
            X.0dK r0 = r0.A1C
            goto L_0x00d7
        L_0x002d:
            java.lang.String r0 = "stories_organic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A11
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "stories_organic_1"
            r0.add(r1)
        L_0x0049:
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A10
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "stories_organic_2"
            r0.add(r1)
        L_0x0058:
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A0w
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "stories_organic_3"
            r0.add(r1)
        L_0x0067:
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A0y
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "stories_organic_4"
            r0.add(r1)
        L_0x0076:
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A0z
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = "stories_organic_5"
            r0.add(r1)
        L_0x0085:
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A0x
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "stories_organic_6"
            r0.add(r1)
        L_0x0094:
            X.0et r1 = r2.devPreferences
            X.0dK r1 = r1.A0v
            boolean r1 = X.AnonymousClass0wJ.A1V(r1)
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = "stories_organic_7"
            r0.add(r1)
            return r0
        L_0x00a4:
            java.lang.String r0 = "stories_netego"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0et r0 = r2.devPreferences
            X.0dK r0 = r0.A1F
            goto L_0x00d7
        L_0x00b1:
            java.lang.String r0 = "reels_organic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0et r0 = r2.devPreferences
            X.0dK r0 = r0.A1D
            goto L_0x00d7
        L_0x00be:
            java.lang.String r0 = "feed_ads"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0et r0 = r2.devPreferences
            X.0dK r0 = r0.A19
            goto L_0x00d7
        L_0x00cb:
            java.lang.String r0 = "feed_netego"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.0et r0 = r2.devPreferences
            X.0dK r0 = r0.A1A
        L_0x00d7:
            java.lang.Object r0 = X.C18220wO.A0f(r0)
            java.util.Set r0 = (java.util.Set) r0
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.LocalMediaInjectionController.getSelectedInjectionItems(java.lang.String):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c4, code lost:
        X.C18240wQ.A1D(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void selectInjectionItems(java.util.Set r4, java.lang.String r5) {
        /*
            r3 = this;
            X.AnonymousClass0wJ.A1N(r4, r5)
            int r0 = r5.hashCode()
            switch(r0) {
                case -2059491644: goto L_0x00b8;
                case -1611522806: goto L_0x00ab;
                case -532323585: goto L_0x0047;
                case -334510404: goto L_0x003a;
                case -332904891: goto L_0x002c;
                case -191590769: goto L_0x001e;
                case 704169745: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0010:
            java.lang.String r0 = "feed_netego"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r0 = r3.devPreferences
            X.0dK r0 = r0.A1A
            goto L_0x00c4
        L_0x001e:
            java.lang.String r0 = "feed_ads"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r0 = r3.devPreferences
            X.0dK r0 = r0.A19
            goto L_0x00c4
        L_0x002c:
            java.lang.String r0 = "reels_organic"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r0 = r3.devPreferences
            X.0dK r0 = r0.A1D
            goto L_0x00c4
        L_0x003a:
            java.lang.String r0 = "stories_netego"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r0 = r3.devPreferences
            X.0dK r0 = r0.A1F
            goto L_0x00c4
        L_0x0047:
            java.lang.String r0 = "stories_organic"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_1"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A11
            X.AnonymousClass0wJ.A1L(r0, r1)
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_2"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A10
            X.AnonymousClass0wJ.A1L(r0, r1)
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_3"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A0w
            X.AnonymousClass0wJ.A1L(r0, r1)
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_4"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A0y
            X.AnonymousClass0wJ.A1L(r0, r1)
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_5"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A0z
            X.AnonymousClass0wJ.A1L(r0, r1)
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_6"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A0x
            X.AnonymousClass0wJ.A1L(r0, r1)
            X.0et r2 = r3.devPreferences
            java.lang.String r0 = "stories_organic_7"
            boolean r1 = r4.contains(r0)
            X.0dK r0 = r2.A0v
            X.AnonymousClass0wJ.A1L(r0, r1)
            return
        L_0x00ab:
            java.lang.String r0 = "reels_ads"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r0 = r3.devPreferences
            X.0dK r0 = r0.A1C
            goto L_0x00c4
        L_0x00b8:
            java.lang.String r0 = "stories_ads"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000a
            X.0et r0 = r3.devPreferences
            X.0dK r0 = r0.A1E
        L_0x00c4:
            X.C18240wQ.A1D(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.LocalMediaInjectionController.selectInjectionItems(java.util.Set, java.lang.String):void");
    }
}
