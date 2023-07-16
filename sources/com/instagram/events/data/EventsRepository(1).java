package com.instagram.events.data;

import X.AnonymousClass1jA;
import X.AnonymousClass22M;
import X.AnonymousClass2TZ;
import X.C04220Ms;
import X.C134647y7;
import X.C18190wL;
import X.C86074wE;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.instagram.events.graphql.EventImpl;
import com.instagram.events.graphql.EventInviteesImpl;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EventsRepository extends C134647y7 {
    public final Context A00;
    public final EventsGraphQLDataSource A01;
    public final UserSession A02;
    public final C86074wE A03 = C18190wL.A0z(new KtCSuperShape0S1200000_I2((AnonymousClass22M) null, 7));
    public final C86074wE A04 = C18190wL.A0z(new KtCSuperShape0S1200000_I2((EventInviteesImpl) null, (Integer) null, (String) null, (DefaultConstructorMarker) null, 7, 12));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventsRepository(Context context, UserSession userSession) {
        super("Events", AnonymousClass2TZ.A00(863894377));
        EventsGraphQLDataSource eventsGraphQLDataSource = new EventsGraphQLDataSource(context, userSession);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = eventsGraphQLDataSource;
    }

    public static /* synthetic */ void A00(AnonymousClass22M r3, EventsRepository eventsRepository, EventImpl eventImpl, int i) {
        if ((i & 1) != 0) {
            r3 = null;
        }
        if ((i & 2) != 0) {
            eventImpl = null;
        }
        C86074wE r2 = eventsRepository.A03;
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = (KtCSuperShape0S1200000_I2) r2.getValue();
        if (eventImpl == null) {
            eventImpl = (EventImpl) ktCSuperShape0S1200000_I2.A00;
        }
        if (r3 == null) {
            r3 = (AnonymousClass22M) ktCSuperShape0S1200000_I2.A01;
        }
        String str = ktCSuperShape0S1200000_I2.A02;
        C04220Ms.A0B(r3, 0);
        r2.CrC(new KtCSuperShape0S1200000_I2(r3, eventImpl, str));
    }

    public static void A01(EventsRepository eventsRepository) {
        eventsRepository.A03.CrC(new KtCSuperShape0S1200000_I2(AnonymousClass22M.LOADED, 4));
    }

    public static void A02(EventsRepository eventsRepository) {
        A00(AnonymousClass22M.ERROR, eventsRepository, (EventImpl) null, 6);
    }

    public static void A03(EventsRepository eventsRepository, Object obj) {
        A00(AnonymousClass22M.LOADED, eventsRepository, (EventImpl) ((AnonymousClass1jA) obj).A00, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C26743EUq r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27, X.C146958n9 r28) {
        /*
            r18 = this;
            r3 = 20
            r4 = r28
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r4)
            r6 = r18
            if (r0 == 0) goto L_0x0072
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 != r3) goto L_0x0078
            java.lang.Object r3 = r5.A01
            com.instagram.events.data.EventsRepository r3 = (com.instagram.events.data.EventsRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x002c:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0041
            X.22M r2 = X.AnonymousClass22M.LOADED
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r1 = r1.A00
            com.instagram.events.graphql.EventImpl r1 = (com.instagram.events.graphql.EventImpl) r1
            r0 = 4
        L_0x003b:
            A00(r2, r3, r1, r0)
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0040:
            return r4
        L_0x0041:
            X.22M r2 = X.AnonymousClass22M.ERROR
            r1 = 0
            r0 = 6
            goto L_0x003b
        L_0x0046:
            X.AnonymousClass0OU.A00(r1)
            X.22M r2 = X.AnonymousClass22M.LOADING
            r1 = 0
            r0 = 6
            A00(r2, r6, r1, r0)
            com.instagram.events.data.EventsGraphQLDataSource r7 = r6.A01
            r5.A01 = r6
            r5.A00 = r3
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r16 = r27
            r17 = r5
            java.lang.Object r1 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 == r4) goto L_0x0040
            r3 = r6
            goto L_0x002c
        L_0x0072:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r5.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x0078:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A04(X.EUq, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r14, java.lang.String r15, java.lang.String r16, X.C146958n9 r17) {
        /*
            r13 = this;
            r3 = 22
            r4 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r4)
            if (r0 == 0) goto L_0x00b5
            r8 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b5
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r8.A02
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r4 = 1
            if (r0 == 0) goto L_0x006e
            if (r0 != r4) goto L_0x00bc
            java.lang.Object r6 = r8.A01
            com.instagram.events.data.EventsRepository r6 = (com.instagram.events.data.EventsRepository) r6
            X.AnonymousClass0OU.A00(r1)
        L_0x002a:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r5 = X.AnonymousClass006.A01
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            com.instagram.events.graphql.EventInviteesImpl r2 = (com.instagram.events.graphql.EventInviteesImpl) r2
            X.4wE r3 = r6.A04
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            if (r2 != 0) goto L_0x0046
            java.lang.Object r2 = r0.A00
            com.instagram.events.graphql.EventInviteesImpl r2 = (com.instagram.events.graphql.EventInviteesImpl) r2
        L_0x0046:
            java.lang.String r1 = r0.A02
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
        L_0x004c:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r6.<init>((com.instagram.events.graphql.EventInviteesImpl) r2, (java.lang.Integer) r5, (java.lang.String) r1)
        L_0x0051:
            r3.CrC(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L_0x0059:
            java.lang.Integer r5 = X.AnonymousClass006.A00
            X.4wE r3 = r6.A04
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            java.lang.Object r2 = r0.A00
            com.instagram.events.graphql.EventInviteesImpl r2 = (com.instagram.events.graphql.EventInviteesImpl) r2
            java.lang.String r1 = r0.A02
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            goto L_0x004c
        L_0x006e:
            X.AnonymousClass0OU.A00(r1)
            if (r14 == 0) goto L_0x00a5
            int r0 = r14.length()
            if (r0 == 0) goto L_0x00a5
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            r6 = r13
            X.4wE r3 = r13.A04
            java.lang.Object r0 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            java.lang.Object r2 = r0.A00
            com.instagram.events.graphql.EventInviteesImpl r2 = (com.instagram.events.graphql.EventInviteesImpl) r2
            java.lang.String r1 = r0.A02
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r0.<init>((com.instagram.events.graphql.EventInviteesImpl) r2, (java.lang.Integer) r5, (java.lang.String) r1)
            r3.CrC(r0)
            com.instagram.events.data.EventsGraphQLDataSource r0 = r13.A01
            r8.A01 = r13
            r8.A00 = r4
            r1 = r16
            java.lang.Object r1 = r0.A02(r14, r15, r1, r8)
            if (r1 != r7) goto L_0x002a
            return r7
        L_0x00a5:
            X.4wE r3 = r13.A04
            java.lang.Integer r8 = X.AnonymousClass006.A01
            r7 = 0
            r11 = 4
            r12 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r9 = r7
            r10 = r7
            r6.<init>((com.instagram.events.graphql.EventInviteesImpl) r7, (java.lang.Integer) r8, (java.lang.String) r9, (kotlin.jvm.internal.DefaultConstructorMarker) r10, (int) r11, (int) r12)
            goto L_0x0051
        L_0x00b5:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r8.<init>(r13, r4, r3)
            goto L_0x0018
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A05(java.lang.String, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 23
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r10)
            if (r0 == 0) goto L_0x005a
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x0068
            java.lang.Object r3 = r6.A01
            com.instagram.events.data.EventsRepository r3 = (com.instagram.events.data.EventsRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0060
            A03(r3, r1)
        L_0x0031:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0036:
            X.AnonymousClass0OU.A00(r1)
            if (r8 == 0) goto L_0x0056
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0056
            X.22M r2 = X.AnonymousClass22M.LOADING
            r1 = 0
            r0 = 6
            r3 = r7
            A00(r2, r7, r1, r0)
            com.instagram.events.data.EventsGraphQLDataSource r0 = r7.A01
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r0.A04(r8, r9, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0056:
            A01(r7)
            goto L_0x0031
        L_0x005a:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r6.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x0060:
            A02(r3)
            java.lang.Boolean r5 = X.C18180wK.A0X()
            return r5
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A06(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r6, java.lang.String r7, X.C146958n9 r8) {
        /*
            r5 = this;
            r3 = 25
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r8)
            if (r0 == 0) goto L_0x0053
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x0061
            java.lang.Object r1 = r4.A01
            com.instagram.events.data.EventsRepository r1 = (com.instagram.events.data.EventsRepository) r1
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0059
            A03(r1, r3)
        L_0x0031:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x0035:
            return r1
        L_0x0036:
            X.AnonymousClass0OU.A00(r3)
            if (r6 == 0) goto L_0x004f
            int r0 = r6.length()
            if (r0 == 0) goto L_0x004f
            com.instagram.events.data.EventsGraphQLDataSource r0 = r5.A01
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A03(r6, r7, r4)
            if (r3 == r1) goto L_0x0035
            r1 = r5
            goto L_0x0028
        L_0x004f:
            A01(r5)
            goto L_0x0031
        L_0x0053:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x0059:
            A02(r1)
            java.lang.Boolean r1 = X.C18180wK.A0X()
            return r1
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A07(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 26
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r10)
            if (r0 == 0) goto L_0x005a
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x0068
            java.lang.Object r3 = r6.A01
            com.instagram.events.data.EventsRepository r3 = (com.instagram.events.data.EventsRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0060
            A03(r3, r1)
        L_0x0031:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0036:
            X.AnonymousClass0OU.A00(r1)
            if (r8 == 0) goto L_0x0056
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0056
            X.22M r2 = X.AnonymousClass22M.LOADING
            r1 = 0
            r0 = 6
            r3 = r7
            A00(r2, r7, r1, r0)
            com.instagram.events.data.EventsGraphQLDataSource r0 = r7.A01
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r0.A05(r8, r9, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0056:
            A01(r7)
            goto L_0x0031
        L_0x005a:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r6.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x0060:
            A02(r3)
            java.lang.Boolean r5 = X.C18180wK.A0X()
            return r5
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A08(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 21
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r9)
            if (r0 == 0) goto L_0x005a
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x0068
            java.lang.Object r3 = r6.A01
            com.instagram.events.data.EventsRepository r3 = (com.instagram.events.data.EventsRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0060
            A03(r3, r1)
        L_0x0031:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0036:
            X.AnonymousClass0OU.A00(r1)
            if (r8 == 0) goto L_0x0056
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0056
            X.22M r2 = X.AnonymousClass22M.LOADING
            r1 = 0
            r0 = 6
            r3 = r7
            A00(r2, r7, r1, r0)
            com.instagram.events.data.EventsGraphQLDataSource r0 = r7.A01
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r0.A06(r8, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0056:
            A01(r7)
            goto L_0x0031
        L_0x005a:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0060:
            A02(r3)
            java.lang.Boolean r5 = X.C18180wK.A0X()
            return r5
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A09(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 24
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r9)
            if (r0 == 0) goto L_0x005a
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x0068
            java.lang.Object r3 = r6.A01
            com.instagram.events.data.EventsRepository r3 = (com.instagram.events.data.EventsRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0060
            A03(r3, r1)
        L_0x0031:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0036:
            X.AnonymousClass0OU.A00(r1)
            if (r8 == 0) goto L_0x0056
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0056
            X.22M r2 = X.AnonymousClass22M.LOADING
            r1 = 0
            r0 = 6
            r3 = r7
            A00(r2, r7, r1, r0)
            com.instagram.events.data.EventsGraphQLDataSource r0 = r7.A01
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r0.A07(r8, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0056:
            A01(r7)
            goto L_0x0031
        L_0x005a:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0060:
            A02(r3)
            java.lang.Boolean r5 = X.C18180wK.A0X()
            return r5
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.data.EventsRepository.A0A(java.lang.String, X.8n9):java.lang.Object");
    }
}
