package X;

/* renamed from: X.2O2  reason: invalid class name */
public final class AnonymousClass2O2 {
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fb, code lost:
        if (r0 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023b, code lost:
        if (X.C18210wN.A0S(r0) == X.AnonymousClass22S.CO_HOST) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026f, code lost:
        if (r0.getEnumValue("viewer_status", X.AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) != r2) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0273, code lost:
        if (r0 == null) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0275, code lost:
        r1 = (X.AnonymousClass22S) r0.getEnumValue("viewer_status", X.AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x027f, code lost:
        if (r1 == null) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0281, code lost:
        r1 = r1.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0285, code lost:
        if (r1 == null) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x028b, code lost:
        if (r1.length() == 0) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x028d, code lost:
        r10 = (X.AnonymousClass251) X.AnonymousClass251.A02.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0295, code lost:
        if (r10 != null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0297, code lost:
        r10 = X.AnonymousClass251.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0299, code lost:
        if (r0 == null) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x029b, code lost:
        r25 = r0.getTreeList("event_page_buttons", com.instagram.events.graphql.EventImpl.EventEvent.EventPageButtons.class);
        r20 = r0.getStringValue("thread_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b4, code lost:
        return new X.AnonymousClass1p9(r9, r10, r11, r12, r13, r14, r15, r16, r4, r18, r19, r20, r7, r22, r5, r24, r25, r26, r27, r28, r29, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b5, code lost:
        r25 = null;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r0 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r0 != null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0183, code lost:
        if (r0 == null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0188, code lost:
        if (r0 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018d, code lost:
        if (r0 != null) goto L_0x018f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0170 A[LOOP:2: B:74:0x016a->B:76:0x0170, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass2O1 A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r30) {
        /*
            r0 = 0
            r5 = r30
            X.C04220Ms.A0B(r5, r0)
            java.lang.Object r0 = r5.A01
            X.22M r0 = (X.AnonymousClass22M) r0
            int r1 = r0.ordinal()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x0018
            r0 = 2
            if (r1 != r0) goto L_0x02be
            X.1p7 r8 = X.AnonymousClass1p7.A00
            return r8
        L_0x0018:
            java.lang.Object r3 = r5.A00
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x02bc
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent> r2 = com.instagram.events.graphql.EventImpl.EventEvent.class
            java.lang.String r1 = "event"
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x02bc
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = "title"
            java.lang.String r11 = r0.getStringValue(r1)
            java.lang.String r1 = "description"
            java.lang.String r12 = r0.getStringValue(r1)
            java.lang.String r1 = "custom_location"
            java.lang.String r18 = r0.getStringValue(r1)
            if (r18 != 0) goto L_0x005e
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$Location> r3 = com.instagram.events.graphql.EventImpl.EventEvent.Location.class
            java.lang.String r2 = "location"
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r2, r3)
            if (r1 == 0) goto L_0x0052
            java.lang.String r18 = X.C18220wO.A0l(r1)
            if (r18 != 0) goto L_0x005e
        L_0x0052:
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r2, r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = "address"
            java.lang.String r18 = r2.getStringValue(r1)
        L_0x005e:
            r6 = 10
            if (r0 == 0) goto L_0x00a2
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$OwnerCohostSocialContext> r2 = com.instagram.events.graphql.EventImpl.EventEvent.OwnerCohostSocialContext.class
            java.lang.String r1 = "owner_cohost_social_context"
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x00a2
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl> r1 = com.instagram.events.graphql.EventSocialContextImpl.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r1)
            if (r3 == 0) goto L_0x00a2
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl$SocialContextUsers> r2 = com.instagram.events.graphql.EventSocialContextImpl.SocialContextUsers.class
            java.lang.String r1 = "social_context_users"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x00a2
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r1, r6)
            java.util.Iterator r3 = r1.iterator()
        L_0x0086:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00a6
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            java.lang.Class<com.instagram.events.graphql.EventUserInfoImpl> r1 = com.instagram.events.graphql.EventUserInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r1)
            X.C04220Ms.A06(r1)
            r7.add(r1)
            goto L_0x0086
        L_0x009d:
            r11 = r4
            r12 = r4
        L_0x009f:
            r18 = r4
            goto L_0x005e
        L_0x00a2:
            X.0ZV r7 = X.AnonymousClass0ZV.A00
            if (r0 == 0) goto L_0x0100
        L_0x00a6:
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$OwnerCohostSocialContext> r2 = com.instagram.events.graphql.EventImpl.EventEvent.OwnerCohostSocialContext.class
            java.lang.String r1 = "owner_cohost_social_context"
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0100
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl> r1 = com.instagram.events.graphql.EventSocialContextImpl.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r1)
            if (r2 == 0) goto L_0x0100
            java.lang.String r1 = "title"
            java.lang.String r13 = r2.getStringValue(r1)
        L_0x00be:
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$OwnerCohostSocialContext> r2 = com.instagram.events.graphql.EventImpl.EventEvent.OwnerCohostSocialContext.class
            java.lang.String r1 = "owner_cohost_social_context"
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0109
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl> r1 = com.instagram.events.graphql.EventSocialContextImpl.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r1)
            if (r3 == 0) goto L_0x0109
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl$SocialContextUsers> r2 = com.instagram.events.graphql.EventSocialContextImpl.SocialContextUsers.class
            java.lang.String r1 = "social_context_users"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x0109
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r1, r6)
            java.util.Iterator r3 = r1.iterator()
        L_0x00e2:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0104
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            java.lang.Class<com.instagram.events.graphql.EventUserInfoImpl> r1 = com.instagram.events.graphql.EventUserInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r1)
            X.4vA r1 = (X.C85424vA) r1
            java.lang.String r1 = r1.B4N()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r1)
            r5.add(r1)
            goto L_0x00e2
        L_0x0100:
            r13 = r4
            if (r0 == 0) goto L_0x0109
            goto L_0x00be
        L_0x0104:
            java.util.List r22 = X.AnonymousClass00J.A0N(r5)
            goto L_0x010b
        L_0x0109:
            X.0ZV r22 = X.AnonymousClass0ZV.A00
        L_0x010b:
            if (r0 == 0) goto L_0x0181
            java.lang.String r1 = "emoji_profile_unicode"
            java.lang.String r14 = r0.getStringValue(r1)
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$ProfilePictureObject> r2 = com.instagram.events.graphql.EventImpl.EventEvent.ProfilePictureObject.class
            java.lang.String r1 = "profile_picture_object"
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0182
            java.lang.String r1 = "profile_pic_url"
            java.lang.String r15 = r2.getStringValue(r1)
        L_0x0123:
            java.lang.String r2 = "emoji_background_unicode"
            java.lang.String r1 = r0.getStringValue(r2)
            if (r1 == 0) goto L_0x0186
            boolean r1 = X.AnonymousClass8bQ.A0n(r1)
            if (r1 != 0) goto L_0x0186
            java.lang.String r16 = r0.getStringValue(r2)
            X.C18240wQ.A1I(r16)
        L_0x0138:
            java.lang.String r1 = "time_string"
            java.lang.String r4 = r0.getStringValue(r1)
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$InviteesSocialContextObjects> r2 = com.instagram.events.graphql.EventImpl.EventEvent.InviteesSocialContextObjects.class
            java.lang.String r1 = "invitees_social_context_objects(usecase:\"event_page\")"
            com.google.common.collect.ImmutableList r1 = r0.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x018b
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r1)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x018b
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl> r1 = com.instagram.events.graphql.EventSocialContextImpl.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r1)
            if (r3 == 0) goto L_0x018b
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl$SocialContextUsers> r2 = com.instagram.events.graphql.EventSocialContextImpl.SocialContextUsers.class
            java.lang.String r1 = "social_context_users"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x018b
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r1, r6)
            java.util.Iterator r3 = r1.iterator()
        L_0x016a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x018f
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            java.lang.Class<com.instagram.events.graphql.EventUserInfoImpl> r1 = com.instagram.events.graphql.EventUserInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r1)
            X.C04220Ms.A06(r1)
            r5.add(r1)
            goto L_0x016a
        L_0x0181:
            r14 = r4
        L_0x0182:
            r15 = r4
            if (r0 == 0) goto L_0x0186
            goto L_0x0123
        L_0x0186:
            java.lang.String r16 = "😀"
            if (r0 == 0) goto L_0x018b
            goto L_0x0138
        L_0x018b:
            X.0ZV r5 = X.AnonymousClass0ZV.A00
            if (r0 == 0) goto L_0x01f9
        L_0x018f:
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$InviteesSocialContextObjects> r2 = com.instagram.events.graphql.EventImpl.EventEvent.InviteesSocialContextObjects.class
            java.lang.String r1 = "invitees_social_context_objects(usecase:\"event_page\")"
            com.google.common.collect.ImmutableList r1 = r0.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x01f9
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r1)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x01f9
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl> r1 = com.instagram.events.graphql.EventSocialContextImpl.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r1)
            if (r2 == 0) goto L_0x01f9
            java.lang.String r1 = "title"
            java.lang.String r19 = r2.getStringValue(r1)
        L_0x01af:
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$InviteesSocialContextObjects> r2 = com.instagram.events.graphql.EventImpl.EventEvent.InviteesSocialContextObjects.class
            java.lang.String r1 = "invitees_social_context_objects(usecase:\"event_page\")"
            com.google.common.collect.ImmutableList r1 = r0.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x0203
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r1)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0203
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl> r1 = com.instagram.events.graphql.EventSocialContextImpl.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r1)
            if (r3 == 0) goto L_0x0203
            java.lang.Class<com.instagram.events.graphql.EventSocialContextImpl$SocialContextUsers> r2 = com.instagram.events.graphql.EventSocialContextImpl.SocialContextUsers.class
            java.lang.String r1 = "social_context_users"
            com.google.common.collect.ImmutableList r1 = r3.getTreeList(r1, r2)
            if (r1 == 0) goto L_0x0203
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r1, r6)
            java.util.Iterator r6 = r1.iterator()
        L_0x01db:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x01fe
            com.facebook.pando.TreeJNI r3 = X.C18210wN.A0G(r6)
            java.lang.Class<com.instagram.events.graphql.EventUserInfoImpl> r1 = com.instagram.events.graphql.EventUserInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r3.reinterpret(r1)
            X.4vA r1 = (X.C85424vA) r1
            java.lang.String r1 = r1.B4N()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r1)
            r2.add(r1)
            goto L_0x01db
        L_0x01f9:
            r19 = 0
            if (r0 == 0) goto L_0x0203
            goto L_0x01af
        L_0x01fe:
            java.util.List r24 = X.AnonymousClass00J.A0N(r2)
            goto L_0x0205
        L_0x0203:
            X.0ZV r24 = X.AnonymousClass0ZV.A00
        L_0x0205:
            if (r0 == 0) goto L_0x0229
            X.20P r2 = X.AnonymousClass20P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "viewer_rsvp_status"
            java.lang.Enum r1 = r0.getEnumValue(r1, r2)
            X.20P r1 = (X.AnonymousClass20P) r1
            if (r1 == 0) goto L_0x0229
            java.lang.String r2 = r1.name()
            if (r2 == 0) goto L_0x0229
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0229
            java.util.Map r1 = X.AnonymousClass253.A02
            java.lang.Object r9 = r1.get(r2)
            X.253 r9 = (X.AnonymousClass253) r9
            if (r9 != 0) goto L_0x022b
        L_0x0229:
            X.253 r9 = X.AnonymousClass253.NONE
        L_0x022b:
            java.lang.Enum r1 = X.C18210wN.A0S(r0)
            X.22S r2 = X.AnonymousClass22S.OWNER
            if (r1 == r2) goto L_0x023d
            java.lang.Enum r3 = X.C18210wN.A0S(r0)
            X.22S r1 = X.AnonymousClass22S.CO_HOST
            r26 = 0
            if (r3 != r1) goto L_0x023f
        L_0x023d:
            r26 = 1
        L_0x023f:
            java.lang.Enum r3 = X.C18210wN.A0S(r0)
            X.22S r1 = X.AnonymousClass22S.CO_HOST
            boolean r27 = X.C18180wK.A1Z(r3, r1)
            java.lang.Enum r3 = X.C18210wN.A0S(r0)
            X.22S r1 = X.AnonymousClass22S.INVITEE
            boolean r28 = X.C18180wK.A1Z(r3, r1)
            if (r0 == 0) goto L_0x02ba
            X.220 r3 = X.AnonymousClass220.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "visibility"
            java.lang.Enum r1 = r0.getEnumValue(r1, r3)
        L_0x025d:
            X.220 r3 = X.AnonymousClass220.PRIVATE
            boolean r29 = X.C18180wK.A1Z(r1, r3)
            if (r0 == 0) goto L_0x0271
            X.22S r3 = X.AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "viewer_status"
            java.lang.Enum r1 = r0.getEnumValue(r1, r3)
            r30 = 1
            if (r1 == r2) goto L_0x0275
        L_0x0271:
            r30 = 0
            if (r0 == 0) goto L_0x0297
        L_0x0275:
            X.22S r2 = X.AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "viewer_status"
            java.lang.Enum r1 = r0.getEnumValue(r1, r2)
            X.22S r1 = (X.AnonymousClass22S) r1
            if (r1 == 0) goto L_0x0297
            java.lang.String r1 = r1.name()
            if (r1 == 0) goto L_0x0297
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0297
            java.util.Map r2 = X.AnonymousClass251.A02
            java.lang.Object r10 = r2.get(r1)
            X.251 r10 = (X.AnonymousClass251) r10
            if (r10 != 0) goto L_0x0299
        L_0x0297:
            X.251 r10 = X.AnonymousClass251.NONE
        L_0x0299:
            if (r0 == 0) goto L_0x02b5
            java.lang.Class<com.instagram.events.graphql.EventImpl$EventEvent$EventPageButtons> r2 = com.instagram.events.graphql.EventImpl.EventEvent.EventPageButtons.class
            java.lang.String r1 = "event_page_buttons"
            com.google.common.collect.ImmutableList r25 = r0.getTreeList(r1, r2)
            java.lang.String r1 = "thread_id"
            java.lang.String r20 = r0.getStringValue(r1)
        L_0x02a9:
            X.1p9 r8 = new X.1p9
            r21 = r7
            r23 = r5
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r8
        L_0x02b5:
            r25 = 0
            r20 = 0
            goto L_0x02a9
        L_0x02ba:
            r1 = 0
            goto L_0x025d
        L_0x02bc:
            java.lang.String r4 = r5.A02
        L_0x02be:
            X.1p8 r8 = new X.1p8
            r8.<init>(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2O2.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2):X.2O1");
    }
}
