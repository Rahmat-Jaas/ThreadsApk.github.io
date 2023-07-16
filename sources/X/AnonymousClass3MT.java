package X;

import com.facebook.pando.TreeJNI;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.3MT  reason: invalid class name */
public final class AnonymousClass3MT {
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0200, code lost:
        if (X.C18210wN.A0S(r1) == X.AnonymousClass22S.CO_HOST) goto L_0x0202;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass2O4 A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r27) {
        /*
            r0 = 0
            r4 = r27
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r6 = 2
            r5 = 1
            r13 = 0
            if (r0 == r5) goto L_0x0016
            if (r0 != r6) goto L_0x0218
            X.1pA r12 = X.AnonymousClass1pA.A00
            return r12
        L_0x0016:
            java.lang.Object r3 = r4.A00
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x0216
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event> r2 = com.instagram.events.graphql.EventInviteesImpl.Event.class
            java.lang.String r1 = "event"
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x0216
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r1, r2)
            if (r1 == 0) goto L_0x0093
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$Invitees> r2 = com.instagram.events.graphql.EventInviteesImpl.Event.Invitees.class
            java.lang.String r0 = "invitees(invitee_rsvp_status:$rsvp_status,query:$search_query)"
            com.facebook.pando.TreeJNI r3 = r1.getTreeValue(r0, r2)
            if (r3 == 0) goto L_0x0093
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$Invitees$Edges> r2 = com.instagram.events.graphql.EventInviteesImpl.Event.Invitees.Edges.class
            java.lang.String r0 = "edges"
            X.83w r12 = X.C18250wR.A0G(r3, r2, r0)
        L_0x0042:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r9 = r12.next()
            com.facebook.pando.TreeJNI r9 = (com.facebook.pando.TreeJNI) r9
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$Invitees$Edges$Node> r8 = com.instagram.events.graphql.EventInviteesImpl.Event.Invitees.Edges.Node.class
            java.lang.String r4 = "node"
            com.facebook.pando.TreeJNI r0 = r9.getTreeValue(r4, r8)
            java.lang.String r0 = X.C18220wO.A0m(r0)
            java.lang.String r11 = java.lang.String.valueOf(r0)
            com.facebook.pando.TreeJNI r10 = r9.getTreeValue(r4, r8)
            r3 = 31
            r2 = 8
            r0 = 30
            java.lang.String r0 = X.AnonymousClass3QD.A00(r3, r2, r0)
            java.lang.String r0 = r10.getStringValue(r0)
            com.instagram.user.model.User r3 = new com.instagram.user.model.User
            r3.<init>(r11, r0)
            com.facebook.pando.TreeJNI r2 = r9.getTreeValue(r4, r8)
            java.lang.String r0 = "full_name"
            java.lang.String r0 = r2.getStringValue(r0)
            r3.A2B(r0)
            com.facebook.pando.TreeJNI r2 = r9.getTreeValue(r4, r8)
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r2.getStringValue(r0)
            r3.A2D(r0)
            r7.add(r3)
            goto L_0x0042
        L_0x0093:
            r7 = r13
        L_0x0094:
            X.0ZV r9 = X.AnonymousClass0ZV.A00
            r22 = r9
            r23 = r9
            r24 = r9
            r25 = r9
            if (r1 == 0) goto L_0x01d5
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$InviteesSocialContextObjects> r2 = com.instagram.events.graphql.EventInviteesImpl.Event.InviteesSocialContextObjects.class
            java.lang.String r0 = "invitees_social_context_objects(usecase:\"invitee_list\")"
            com.google.common.collect.ImmutableList r0 = r1.getTreeList(r0, r2)
            if (r0 == 0) goto L_0x01d5
            java.util.Iterator r8 = r0.iterator()
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
        L_0x00ba:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x020d
            com.facebook.pando.TreeJNI r3 = X.C18210wN.A0G(r8)
            if (r3 == 0) goto L_0x00e8
            X.20P r2 = X.AnonymousClass20P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "rsvp_status"
            java.lang.Enum r0 = r3.getEnumValue(r0, r2)
            X.20P r0 = (X.AnonymousClass20P) r0
            if (r0 == 0) goto L_0x00e8
            java.lang.String r2 = r0.name()
            if (r2 == 0) goto L_0x00e8
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00e8
            java.util.Map r0 = X.AnonymousClass253.A02
            java.lang.Object r0 = r0.get(r2)
            X.253 r0 = (X.AnonymousClass253) r0
            if (r0 != 0) goto L_0x00ea
        L_0x00e8:
            X.253 r0 = X.AnonymousClass253.NONE
        L_0x00ea:
            int r2 = r0.ordinal()
            r0 = 10
            if (r2 == r5) goto L_0x019f
            r4 = 6
            if (r2 == r4) goto L_0x0168
            r4 = 3
            if (r2 == r4) goto L_0x0130
            if (r2 != r6) goto L_0x00ba
            if (r3 == 0) goto L_0x0129
            java.lang.String r2 = "title"
            java.lang.String r19 = r3.getStringValue(r2)
            java.lang.String r2 = "subtitle"
            java.lang.String r20 = r3.getStringValue(r2)
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$InviteesSocialContextObjects$SocialContextUsers> r4 = com.instagram.events.graphql.EventInviteesImpl.Event.InviteesSocialContextObjects.SocialContextUsers.class
            java.lang.String r2 = "social_context_users"
            com.google.common.collect.ImmutableList r2 = r3.getTreeList(r2, r4)
            if (r2 == 0) goto L_0x012d
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x011a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0124
            A01(r0, r2)
            goto L_0x011a
        L_0x0124:
            java.util.List r25 = X.AnonymousClass00J.A0N(r0)
            goto L_0x00ba
        L_0x0129:
            r19 = 0
            r20 = 0
        L_0x012d:
            r25 = r9
            goto L_0x00ba
        L_0x0130:
            if (r3 == 0) goto L_0x0160
            java.lang.String r2 = "title"
            java.lang.String r17 = r3.getStringValue(r2)
            java.lang.String r2 = "subtitle"
            java.lang.String r18 = r3.getStringValue(r2)
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$InviteesSocialContextObjects$SocialContextUsers> r4 = com.instagram.events.graphql.EventInviteesImpl.Event.InviteesSocialContextObjects.SocialContextUsers.class
            java.lang.String r2 = "social_context_users"
            com.google.common.collect.ImmutableList r2 = r3.getTreeList(r2, r4)
            if (r2 == 0) goto L_0x0164
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0150:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x015a
            A01(r0, r2)
            goto L_0x0150
        L_0x015a:
            java.util.List r24 = X.AnonymousClass00J.A0N(r0)
            goto L_0x00ba
        L_0x0160:
            r17 = 0
            r18 = 0
        L_0x0164:
            r24 = r9
            goto L_0x00ba
        L_0x0168:
            if (r3 == 0) goto L_0x0198
            java.lang.String r2 = "title"
            java.lang.String r15 = r3.getStringValue(r2)
            java.lang.String r2 = "subtitle"
            java.lang.String r16 = r3.getStringValue(r2)
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$InviteesSocialContextObjects$SocialContextUsers> r4 = com.instagram.events.graphql.EventInviteesImpl.Event.InviteesSocialContextObjects.SocialContextUsers.class
            java.lang.String r2 = "social_context_users"
            com.google.common.collect.ImmutableList r2 = r3.getTreeList(r2, r4)
            if (r2 == 0) goto L_0x019b
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0188:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0192
            A01(r0, r2)
            goto L_0x0188
        L_0x0192:
            java.util.List r23 = X.AnonymousClass00J.A0N(r0)
            goto L_0x00ba
        L_0x0198:
            r15 = 0
            r16 = 0
        L_0x019b:
            r23 = r9
            goto L_0x00ba
        L_0x019f:
            if (r3 == 0) goto L_0x01cf
            java.lang.String r2 = "title"
            java.lang.String r13 = r3.getStringValue(r2)
            java.lang.String r2 = "subtitle"
            java.lang.String r14 = r3.getStringValue(r2)
            java.lang.Class<com.instagram.events.graphql.EventInviteesImpl$Event$InviteesSocialContextObjects$SocialContextUsers> r4 = com.instagram.events.graphql.EventInviteesImpl.Event.InviteesSocialContextObjects.SocialContextUsers.class
            java.lang.String r2 = "social_context_users"
            com.google.common.collect.ImmutableList r2 = r3.getTreeList(r2, r4)
            if (r2 == 0) goto L_0x01d1
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x01bf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c9
            A01(r0, r2)
            goto L_0x01bf
        L_0x01c9:
            java.util.List r22 = X.AnonymousClass00J.A0N(r0)
            goto L_0x00ba
        L_0x01cf:
            r13 = 0
            r14 = 0
        L_0x01d1:
            r22 = r9
            goto L_0x00ba
        L_0x01d5:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            if (r1 != 0) goto L_0x020d
            r2 = 0
        L_0x01e4:
            X.220 r0 = X.AnonymousClass220.PRIVATE
            boolean r26 = X.C18180wK.A1Z(r2, r0)
            if (r7 == 0) goto L_0x020a
            java.util.List r21 = X.AnonymousClass00J.A0N(r7)
        L_0x01f0:
            java.lang.Enum r2 = X.C18210wN.A0S(r1)
            X.22S r0 = X.AnonymousClass22S.OWNER
            if (r2 == r0) goto L_0x0202
            java.lang.Enum r1 = X.C18210wN.A0S(r1)
            X.22S r0 = X.AnonymousClass22S.CO_HOST
            r27 = 0
            if (r1 != r0) goto L_0x0204
        L_0x0202:
            r27 = 1
        L_0x0204:
            X.1pC r12 = new X.1pC
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r12
        L_0x020a:
            r21 = 0
            goto L_0x01f0
        L_0x020d:
            X.220 r2 = X.AnonymousClass220.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "visibility"
            java.lang.Enum r2 = r1.getEnumValue(r0, r2)
            goto L_0x01e4
        L_0x0216:
            java.lang.String r13 = r4.A02
        L_0x0218:
            X.1pB r12 = new X.1pB
            r12.<init>(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MT.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2):X.2O4");
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(new SimpleImageUrl(((TreeJNI) it.next()).getStringValue("profile_pic_url")));
    }
}
