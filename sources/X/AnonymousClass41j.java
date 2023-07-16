package X;

import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.41j  reason: invalid class name */
public final class AnonymousClass41j implements C83334rD {
    public final /* synthetic */ C82934qW A00;
    public final /* synthetic */ ReelDashboardFragment A01;
    public final /* synthetic */ String A02;

    public AnonymousClass41j(C82934qW r1, ReelDashboardFragment reelDashboardFragment, String str) {
        this.A01 = reelDashboardFragment;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onFailure(Throwable th) {
        C149558tz r2 = this.A01.mListAdapter;
        if (r2 != null) {
            r2.A08(this.A02, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r2.getBooleanValue("has_next_page") == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018a, code lost:
        if (r12.getBooleanValue("is_verified") == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ab, code lost:
        if (r12.getBooleanValue("has_interop_enabled") == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c4, code lost:
        if (r12.getBooleanValue("is_blocked_by_viewer") == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d7, code lost:
        if (r12.getBooleanValue("is_viewer_story_hidden_from_user") == false) goto L_0x01d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r31
            X.8gY r0 = (X.C143338gY) r0
            if (r0 == 0) goto L_0x0283
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0283
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory> r2 = com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.class
            java.lang.String r1 = "xcxp_fetch_story(content_destinations:[\"FB\"],content_source:\"IG\",id:$id)"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r1, r2)
            if (r0 == 0) goto L_0x0283
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r1, r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0283
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r1, r2)
            r10 = 0
            java.lang.Object r5 = r0.get(r10)
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            if (r5 == 0) goto L_0x0283
            java.lang.String r4 = "XFBXPSStoryCardCXPWrapper"
            boolean r0 = r5.isFulfilled(r4)
            if (r0 == 0) goto L_0x0283
            java.lang.Class<com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory$InlineXFBXPSStoryCardCXPWrapper> r3 = com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.InlineXFBXPSStoryCardCXPWrapper.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r3)
            if (r0 == 0) goto L_0x0283
            boolean r0 = r5.isFulfilled(r4)
            if (r0 != 0) goto L_0x025f
            r0 = 0
        L_0x0046:
            java.lang.Class<com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory$InlineXFBXPSStoryCardCXPWrapper$FbStory> r2 = com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.InlineXFBXPSStoryCardCXPWrapper.FbStory.class
            java.lang.String r1 = "story_card"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x0283
            boolean r0 = r5.isFulfilled(r4)
            if (r0 != 0) goto L_0x0259
            r0 = 0
        L_0x0057:
            com.facebook.pando.TreeJNI r8 = r0.getTreeValue(r1, r2)
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl> r7 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.class
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers> r6 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.class
            java.lang.String r5 = "edge_story_media_viewers(after:$after,before:$before,first:$first,last:$last)"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x0283
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x0283
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$Edges> r9 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.Edges.class
            java.lang.String r3 = "edges"
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r3, r9)
            if (r0 == 0) goto L_0x0283
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$PageInfo> r4 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.PageInfo.class
            java.lang.String r2 = "page_info"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r2, r4)
            if (r0 == 0) goto L_0x0283
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r2, r4)
            java.lang.String r1 = "end_cursor"
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x0283
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            com.google.common.collect.ImmutableList r3 = r0.getTreeList(r3, r9)
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r2, r4)
            java.lang.String r25 = r2.getStringValue(r1)
            java.lang.String r1 = "has_next_page"
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L_0x00d8
            boolean r1 = r2.getBooleanValue(r1)
            r0 = 1
            if (r1 != 0) goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 != 0) goto L_0x00e1
            r25 = 0
        L_0x00e1:
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r16 = r3.iterator()
        L_0x00ed:
            boolean r0 = r16.hasNext()
            r2 = r30
            if (r0 == 0) goto L_0x0265
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r16)
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r14 = r2.A01
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$Edges$Node> r2 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.Edges.Node.class
            java.lang.String r1 = "node"
            com.facebook.pando.TreeJNI r0 = r13.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x00ed
            com.facebook.pando.TreeJNI r1 = r13.getTreeValue(r1, r2)
            java.lang.Class<com.instagram.reels.api.FBStoryViewerFragmentImpl> r0 = com.instagram.reels.api.FBStoryViewerFragmentImpl.class
            com.facebook.pando.TreeJNI r12 = r1.reinterpret(r0)
            java.lang.Class<com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto> r11 = com.instagram.reels.api.FBStoryViewerFragmentImpl.ProfilePhoto.class
            java.lang.String r9 = "profile_photo(height:$profile_pic_height,width:$profile_pic_width)"
            com.facebook.pando.TreeJNI r0 = r12.getTreeValue(r9, r11)
            if (r0 == 0) goto L_0x00ed
            com.facebook.pando.TreeJNI r1 = r12.getTreeValue(r9, r11)
            java.lang.String r8 = "XFBXPSProfilePhoto"
            boolean r0 = r1.isFulfilled(r8)
            if (r0 == 0) goto L_0x00ed
            java.lang.Class<com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto$InlineXFBXPSProfilePhoto> r7 = com.instagram.reels.api.FBStoryViewerFragmentImpl.ProfilePhoto.InlineXFBXPSProfilePhoto.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r7)
            if (r0 == 0) goto L_0x00ed
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$Edges$EmojiReactions> r6 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.Edges.EmojiReactions.class
            java.lang.String r5 = "emoji_reactions"
            com.google.common.collect.ImmutableList r0 = r13.getTreeList(r5, r6)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r4 = "strong_id__"
            java.lang.String r0 = r12.getStringValue(r4)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r3 = r12.getStringValue(r4)
            java.lang.String r2 = "name"
            java.lang.String r1 = r12.getStringValue(r2)
            com.instagram.user.model.User r0 = new com.instagram.user.model.User
            r0.<init>(r3, r1)
            com.facebook.pando.TreeJNI r1 = r12.getTreeValue(r9, r11)
            boolean r3 = r1.isFulfilled(r8)
            if (r3 != 0) goto L_0x0253
            r1 = 0
        L_0x0159:
            java.lang.String r1 = r1.getStringValue(r4)
            r0.A2C(r1)
            com.facebook.pando.TreeJNI r3 = r12.getTreeValue(r9, r11)
            boolean r1 = r3.isFulfilled(r8)
            if (r1 != 0) goto L_0x024d
            r1 = 0
        L_0x016b:
            java.lang.String r3 = "url"
            java.lang.String r1 = r1.getStringValue(r3)
            r0.A2D(r1)
            java.lang.String r1 = r12.getStringValue(r2)
            r0.A2B(r1)
            java.lang.String r3 = "is_verified"
            boolean r1 = r12.hasFieldValue(r3)
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L_0x018c
            boolean r3 = r12.getBooleanValue(r3)
            r1 = 1
            if (r3 != 0) goto L_0x018d
        L_0x018c:
            r1 = 0
        L_0x018d:
            r0.A2Z(r1)
            r0.A1h(r2)
            java.lang.String r1 = r12.getStringValue(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.A2A(r1)
            java.lang.String r3 = "has_interop_enabled"
            boolean r1 = r12.hasFieldValue(r3)
            if (r1 == 0) goto L_0x01ad
            boolean r3 = r12.getBooleanValue(r3)
            r1 = 1
            if (r3 != 0) goto L_0x01ae
        L_0x01ad:
            r1 = 0
        L_0x01ae:
            X.MeW r3 = r0.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.Cle(r1)
            java.lang.String r3 = "is_blocked_by_viewer"
            boolean r1 = r12.hasFieldValue(r3)
            if (r1 == 0) goto L_0x01c6
            boolean r3 = r12.getBooleanValue(r3)
            r1 = 1
            if (r3 != 0) goto L_0x01c7
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            r0.A2H(r1)
            java.lang.String r3 = "is_viewer_story_hidden_from_user"
            boolean r1 = r12.hasFieldValue(r3)
            if (r1 == 0) goto L_0x01d9
            boolean r3 = r12.getBooleanValue(r3)
            r1 = 1
            if (r3 != 0) goto L_0x01da
        L_0x01d9:
            r1 = 0
        L_0x01da:
            r0.A2I(r1)
            java.lang.String r3 = "is_friends_with_viewer"
            boolean r1 = r12.hasFieldValue(r3)
            if (r1 == 0) goto L_0x01ec
            boolean r1 = r12.getBooleanValue(r3)
            if (r1 == 0) goto L_0x01ec
            r7 = 1
        L_0x01ec:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r0.A24(r1)
            com.instagram.service.session.UserSession r1 = r14.A0A
            X.Dnj r1 = X.AnonymousClass6VR.A00(r1)
            r1.A01(r0, r2)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r20 = 0
            X.83w r7 = X.C18250wR.A0G(r13, r6, r5)
            r6 = r20
        L_0x0208:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0232
            com.facebook.pando.TreeJNI r5 = X.C18210wN.A0G(r7)
            java.lang.String r2 = "reaction"
            java.lang.String r1 = r5.getStringValue(r2)
            if (r1 == 0) goto L_0x0208
            java.lang.String r1 = r5.getStringValue(r2)
            r3 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2
            r6.<init>(r1, r3)
            java.lang.String r2 = r5.getStringValue(r2)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2
            r1.<init>(r2, r3)
            r4.add(r1)
            goto L_0x0208
        L_0x0232:
            java.lang.String r23 = ""
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1500000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1500000_I2
            r21 = r0
            r22 = r20
            r24 = r4
            r18 = r2
            r19 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1 = r17
            r1.add(r0)
            r15.add(r2)
            goto L_0x00ed
        L_0x024d:
            com.facebook.pando.TreeJNI r1 = r3.reinterpret(r7)
            goto L_0x016b
        L_0x0253:
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r7)
            goto L_0x0159
        L_0x0259:
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r3)
            goto L_0x0057
        L_0x025f:
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r3)
            goto L_0x0046
        L_0x0265:
            X.4qW r0 = r2.A00
            r27 = 0
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r10)
            r26 = r17
            r28 = r15
            r29 = r10
            r23 = r0
            r23.ByU(r24, r25, r26, r27, r28, r29)
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r0 = r2.A01
            X.8tz r1 = r0.mListAdapter
            if (r1 == 0) goto L_0x0283
            java.lang.String r0 = r2.A02
            r1.A08(r0, r10)
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass41j.onSuccess(java.lang.Object):void");
    }
}
