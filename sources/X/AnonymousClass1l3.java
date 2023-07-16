package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1l3  reason: invalid class name */
public final class AnonymousClass1l3 extends AnonymousClass1lO {
    public final C11630kW A00;
    public final UserSession A01;
    public final AnonymousClass3IU A02;
    public final AnonymousClass39C A03;

    public final Class modelClass() {
        return AnonymousClass48N.class;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C41882MfV r28, X.M5O r29) {
        /*
            r27 = this;
            r7 = r29
            r8 = r28
            X.48N r8 = (X.AnonymousClass48N) r8
            X.13q r7 = (X.C202313q) r7
            r6 = 0
            boolean r21 = X.AnonymousClass0wJ.A1Z(r8, r7)
            com.instagram.common.ui.base.IgLinearLayout r13 = r7.A07
            r20 = 0
            r0 = r20
            r13.setBackground(r0)
            com.instagram.common.ui.base.IgTextView r2 = r7.A0A
            r1 = 8
            r2.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r12 = r7.A0C
            r12.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r11 = r7.A09
            r11.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r10 = r7.A0B
            r10.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A0E
            r26 = r0
            r0.setVisibility(r1)
            android.widget.VideoView r5 = r7.A06
            r5.setVisibility(r1)
            android.view.View r0 = r7.A04
            r22 = r0
            r0.setVisibility(r1)
            r9 = r27
            X.39C r14 = r9.A03
            android.view.View r0 = r7.A05
            r25 = r0
            X.3Vc r4 = r8.A00
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r3 = r4.A05
            if (r3 == 0) goto L_0x03ee
            java.lang.String r2 = X.C18220wO.A0m(r3)
            if (r2 == 0) goto L_0x006b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.Jix r2 = X.C37284Jnx.A00(r4, r0, r2)
            X.1o0 r0 = r14.A01
            r2.A01(r0)
            X.Jnx r13 = r2.A02()
            X.GbW r2 = r14.A00
            r0 = r25
            r2.A03(r0, r13)
        L_0x006b:
            android.view.View r2 = r7.A03
            X.3Vc r0 = r4.A06
            if (r0 == 0) goto L_0x0072
            r1 = 0
        L_0x0072:
            r2.setVisibility(r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r13 = r7.A0F
            r13.A04()
            r0 = 218(0xda, float:3.05E-43)
            X.AnonymousClass0wJ.A18(r13, r0, r9, r3)
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Author> r15 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Author.class
            java.lang.String r2 = "author"
            com.facebook.pando.TreeJNI r14 = r3.getTreeValue(r2, r15)
            if (r14 == 0) goto L_0x00b0
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Author$ProfilePicture100> r1 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Author.ProfilePicture100.class
            java.lang.String r0 = "profile_picture(scale:1,width:100)"
            com.facebook.pando.TreeJNI r0 = r14.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = X.C18250wR.A0Y(r0)
            if (r0 == 0) goto L_0x00b0
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r0)
            X.0kW r0 = r9.A00
            r13.A09(r1, r0)
            android.graphics.drawable.Drawable r0 = r7.A01
            r13.setBottomBadgeDrawable(r0)
            android.content.Context r1 = r7.A00
            r0 = 3
            float r0 = X.C09860go.A03(r1, r0)
            r13.A01 = r0
        L_0x00b0:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r2, r15)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = X.C18220wO.A0l(r0)
            if (r0 != 0) goto L_0x00c3
        L_0x00c1:
            java.lang.String r0 = ""
        L_0x00c3:
            r1.append(r0)
            android.content.Context r2 = r7.A00
            int r14 = r1.length()
            r0 = 2131887420(0x7f12053c, float:1.9409447E38)
            android.text.style.TextAppearanceSpan r13 = new android.text.style.TextAppearanceSpan
            r13.<init>(r2, r0)
            r17 = 33
            r0 = r17
            r1.setSpan(r13, r6, r14, r0)
            int r0 = r1.length()
            X.C36062Pw.A00(r2, r1, r0)
            boolean r0 = r4.A02()
            java.lang.String r16 = "line.separator"
            if (r0 != 0) goto L_0x0175
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Body> r15 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Body.class
            java.lang.String r13 = "body"
            com.facebook.pando.TreeJNI r14 = r3.getTreeValue(r13, r15)
            if (r14 == 0) goto L_0x01a4
            java.lang.String r0 = "text"
            java.lang.String r14 = r14.getStringValue(r0)
            if (r14 == 0) goto L_0x01a4
            boolean r0 = X.AnonymousClass8bQ.A0n(r14)
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = java.lang.System.getProperty(r16)
            r1.append(r0)
            int r19 = r1.length()
            r1.append(r14)
            com.facebook.pando.TreeJNI r14 = r3.getTreeValue(r13, r15)
            if (r14 == 0) goto L_0x01a4
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Body$Ranges> r13 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Body.Ranges.class
            java.lang.String r0 = "ranges"
            com.google.common.collect.ImmutableList r0 = r14.getTreeList(r0, r13)
            if (r0 == 0) goto L_0x01a4
            java.util.Iterator r18 = r0.iterator()
        L_0x0124:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01a4
            com.facebook.pando.TreeJNI r17 = X.C18210wN.A0G(r18)
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Body$Ranges$Entity> r14 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Body.Ranges.Entity.class
            java.lang.String r13 = "entity"
            r0 = r17
            com.facebook.pando.TreeJNI r13 = r0.getTreeValue(r13, r14)
            if (r13 == 0) goto L_0x0124
            java.lang.String r0 = "XFBUser"
            boolean r0 = r13.isFulfilled(r0)
            if (r0 == 0) goto L_0x0124
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Body$Ranges$Entity$InlineXFBUser> r0 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Body.Ranges.Entity.InlineXFBUser.class
            com.facebook.pando.TreeJNI r16 = r13.reinterpret(r0)
            if (r16 == 0) goto L_0x0124
            r0 = 2
            com.facebook.redex.IDxCSpanShape1S0300000_1_I2 r15 = new com.facebook.redex.IDxCSpanShape1S0300000_1_I2
            r13 = r0
            r0 = r16
            r15.<init>(r13, r7, r0, r9)
            java.lang.String r13 = "offset"
            r0 = r17
            int r16 = r0.getIntValue(r13)
            int r16 = r16 + r19
            int r14 = r0.getIntValue(r13)
            int r14 = r14 + r19
            java.lang.String r0 = "length"
            r13 = r0
            r0 = r17
            int r0 = r0.getIntValue(r13)
            int r14 = r14 + r0
            r0 = 17
            r13 = r16
            r1.setSpan(r15, r13, r14, r0)
            goto L_0x0124
        L_0x0175:
            java.lang.String r0 = java.lang.System.getProperty(r16)
            r1.append(r0)
            android.content.res.Resources r13 = r2.getResources()
            r0 = 2131828283(0x7f111e3b, float:1.9289502E38)
            java.lang.String r0 = r13.getString(r0)
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r0)
            int r15 = r14.length()
            r0 = 2130970056(0x7f0405c8, float:1.7548811E38)
            int r13 = X.C18220wO.A02(r2, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r13)
            r13 = r17
            r14.setSpan(r0, r6, r15, r13)
            r1.append(r14)
        L_0x01a4:
            com.instagram.common.ui.base.IgTextView r13 = r7.A08
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r13.setText(r1, r0)
            X.C18180wK.A0z(r13)
            com.instagram.common.ui.base.IgTextView r13 = r7.A0D
            java.lang.String r0 = "created_time"
            long r0 = r3.getTimeValue(r0)
            java.lang.String r0 = X.C19591Ayr.A06(r2, r0)
            r13.setText(r0)
            r13.setVisibility(r6)
            boolean r0 = r4.A02()
            if (r0 != 0) goto L_0x02ec
            r0 = 2131834787(0x7f1137a3, float:1.9302694E38)
            r12.setText(r0)
            r12.setVisibility(r6)
            r1 = 70
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.AnonymousClass48N) r8, (X.C202313q) r7, (X.AnonymousClass1l3) r9, (int) r1)
            r12.setOnClickListener(r0)
            boolean r0 = r8.A01
            r1 = r0 ^ 1
            r12.setEnabled(r1)
            float r0 = X.C18230wP.A00(r1)
            r12.setAlpha(r0)
            r11.setVisibility(r6)
            r12 = 6
            com.facebook.redex.IDxCListenerShape447S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape447S0100000_1_I2
            r0.<init>(r7, r12)
            r11.setOnLongClickListener(r0)
            X.39D r13 = r4.A01()
            if (r13 == 0) goto L_0x03cc
            int r12 = r13.A00
            if (r12 == 0) goto L_0x03cc
            r0 = r21
            if (r12 != r0) goto L_0x03b7
            r0 = 2131829614(0x7f11236e, float:1.9292202E38)
            r11.setText(r0)
        L_0x0207:
            android.content.Context r12 = r11.getContext()
            r0 = 2130970053(0x7f0405c5, float:1.7548805E38)
            int r0 = X.C121907Is.A02(r12, r0)
            X.C18180wK.A0s(r12, r11, r0)
            r0 = 69
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r12 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r12.<init>((X.AnonymousClass48N) r8, (X.C202313q) r7, (X.AnonymousClass1l3) r9, (int) r0)
        L_0x021c:
            r11.setOnClickListener(r12)
            r11.setEnabled(r1)
            float r0 = X.C18230wP.A00(r1)
            r11.setAlpha(r0)
        L_0x0229:
            int r0 = r4.A00()
            if (r0 <= 0) goto L_0x03ac
            android.content.res.Resources r13 = r2.getResources()
            r12 = 2131689797(0x7f0f0145, float:1.900862E38)
            int r11 = r4.A00()
            int r0 = r4.A00()
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r0 = r13.getQuantityString(r12, r11, r0)
            r10.setText(r0)
            r10.setVisibility(r6)
            r0 = 222(0xde, float:3.11E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r9, r8, r0)
        L_0x0252:
            r10.setOnClickListener(r0)
            r10.setEnabled(r1)
            float r0 = X.C18230wP.A00(r1)
            r10.setAlpha(r0)
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Attachments> r1 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Attachments.class
            java.lang.String r0 = "attachments"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x02ec
            java.lang.Object r10 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r10 = (com.facebook.pando.TreeJNI) r10
            if (r10 == 0) goto L_0x02ec
            r0 = 219(0xdb, float:3.07E-43)
            X.AnonymousClass0wJ.A18(r5, r0, r9, r4)
            r1 = 220(0xdc, float:3.08E-43)
            r0 = r26
            X.AnonymousClass0wJ.A18(r0, r1, r9, r4)
            r1 = 221(0xdd, float:3.1E-43)
            r0 = r22
            X.AnonymousClass0wJ.A18(r0, r1, r9, r4)
            X.9vz r1 = X.C171049vz.A05
            java.lang.String r0 = "style_list"
            com.google.common.collect.ImmutableList r1 = r10.getEnumList(r0, r1)
            X.C04220Ms.A06(r1)
            X.9vz r0 = X.C171049vz.A01
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x02b7
            X.9vz r0 = X.C171049vz.A02
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x02b7
            X.9vz r0 = X.C171049vz.A03
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x02b7
            X.9vz r0 = X.C171049vz.A04
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x02b7
            X.9vz r0 = X.C171049vz.A06
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03a5
        L_0x02b7:
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Attachments$Media> r11 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Attachments.Media.class
            java.lang.String r4 = "media"
            com.facebook.pando.TreeJNI r1 = r10.getTreeValue(r4, r11)
            if (r1 == 0) goto L_0x0308
            java.lang.String r0 = "XFBVideo"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x0308
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Attachments$Media$InlineXFBVideo> r0 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Attachments.Media.InlineXFBVideo.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            if (r1 == 0) goto L_0x0308
            r5.setVisibility(r6)
            java.lang.String r0 = "playable_url"
            java.lang.String r0 = r1.getStringValue(r0)
            r5.setVideoPath(r0)
            X.DuH r0 = X.C25895DuH.A00
            r5.setOnPreparedListener(r0)
            com.facebook.redex.IDxCListenerShape553S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape553S0100000_1_I2
            r0 = r21
            r1.<init>(r7, r0)
            r5.setOnCompletionListener(r1)
        L_0x02ec:
            android.view.View r3 = r7.A02
            r1 = 2
            com.facebook.redex.IDxCListenerShape173S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape173S0200000_1_I2
            r0.<init>(r1, r8, r9)
            r3.setOnLongClickListener(r0)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0307
            r0 = 2130970726(0x7f040866, float:1.755017E38)
            int r1 = X.C121907Is.A02(r2, r0)
            r0 = r25
            r0.setBackgroundResource(r1)
        L_0x0307:
            return
        L_0x0308:
            com.facebook.pando.TreeJNI r3 = r10.getTreeValue(r4, r11)
            if (r3 == 0) goto L_0x037f
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Attachments$Media$AnimatedImage> r1 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Attachments.Media.AnimatedImage.class
            java.lang.String r0 = "animated_image"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r0, r1)
            if (r3 == 0) goto L_0x037f
            r0 = r26
            r0.setVisibility(r6)
            java.lang.String r4 = X.C18250wR.A0Y(r3)
            if (r4 == 0) goto L_0x03e9
            java.lang.String r14 = "width"
            int r1 = r3.getIntValue(r14)
            java.lang.String r13 = "height"
            int r0 = r3.getIntValue(r13)
            com.instagram.common.typedurl.SimpleImageUrl r11 = new com.instagram.common.typedurl.SimpleImageUrl
            r11.<init>(r4, r1, r0)
            com.instagram.service.session.UserSession r10 = r9.A01
            java.lang.String r5 = r11.A00
            X.C04220Ms.A06(r5)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r4 = (float) r0
            r12 = -1
            int r1 = r3.getIntValue(r14)
            int r0 = r3.getIntValue(r13)
            X.G8A r3 = new X.G8A
            r3.<init>(r12, r1, r0)
            r0 = 2131099965(0x7f06013d, float:1.7812298E38)
            int r22 = r2.getColor(r0)
            int r23 = r2.getColor(r0)
            java.lang.Integer r19 = X.AnonymousClass006.A01
            X.F1M r1 = new X.F1M
            r12 = r1
            r13 = r2
            r14 = r11
            r15 = r20
            r16 = r15
            r17 = r3
            r18 = r10
            r20 = r5
            r21 = r4
            r24 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r26
            r0.setImageDrawable(r1)
            goto L_0x02ec
        L_0x037f:
            com.facebook.pando.TreeJNI r3 = r10.getTreeValue(r4, r11)
            if (r3 == 0) goto L_0x03a5
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Attachments$Media$Image> r1 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Attachments.Media.Image.class
            java.lang.String r0 = "image"
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x03a5
            java.lang.String r1 = X.C18250wR.A0Y(r0)
            if (r1 == 0) goto L_0x03a5
            r0 = r26
            r0.setVisibility(r6)
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.C18250wR.A0K(r1)
            X.0kW r1 = r9.A00
            r0.setUrl(r3, r1)
            goto L_0x02ec
        L_0x03a5:
            r0 = r22
            r0.setVisibility(r6)
            goto L_0x02ec
        L_0x03ac:
            X.C18250wR.A0t(r10)
            r0 = 8
            r10.setVisibility(r0)
            r0 = 0
            goto L_0x0252
        L_0x03b7:
            java.lang.String r0 = r13.A01
            if (r0 == 0) goto L_0x03c0
            r11.setText(r0)
            goto L_0x0207
        L_0x03c0:
            r0 = r20
            r11.setOnClickListener(r0)
            r0 = 8
            r11.setVisibility(r0)
            goto L_0x0229
        L_0x03cc:
            r0 = 2131829608(0x7f112368, float:1.929219E38)
            r11.setText(r0)
            android.content.Context r12 = r11.getContext()
            r0 = 2130970056(0x7f0405c8, float:1.7548811E38)
            int r0 = X.C121907Is.A02(r12, r0)
            X.C18180wK.A0s(r12, r11, r0)
            r0 = 68
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r12 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r12.<init>((X.AnonymousClass48N) r8, (X.C202313q) r7, (X.AnonymousClass1l3) r9, (int) r0)
            goto L_0x021c
        L_0x03e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x03ee:
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>()
            android.content.Context r3 = r7.A00
            r0 = 2131100119(0x7f0601d7, float:1.781261E38)
            int r0 = r3.getColor(r0)
            r5.setColor(r0)
            r13.setBackground(r5)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            java.lang.String r0 = r4.A07
            if (r0 != 0) goto L_0x040d
            java.lang.String r0 = ""
        L_0x040d:
            r10.append(r0)
            int r13 = r10.length()
            r5 = 0
            r0 = 2131887420(0x7f12053c, float:1.9409447E38)
            android.text.style.TextAppearanceSpan r8 = new android.text.style.TextAppearanceSpan
            r8.<init>(r3, r0)
            r0 = 33
            r10.setSpan(r8, r6, r13, r0)
            int r0 = r10.length()
            X.C36062Pw.A00(r3, r10, r0)
            java.lang.String r8 = r4.A09
            if (r8 == 0) goto L_0x043f
            boolean r0 = X.AnonymousClass8bQ.A0n(r8)
            if (r0 != 0) goto L_0x043f
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r10.append(r0)
            r10.append(r8)
        L_0x043f:
            com.instagram.common.ui.base.IgTextView r0 = r7.A08
            r0.setText(r10)
            r2.setVisibility(r6)
            android.view.View r2 = r7.A03
            X.3Vc r0 = r4.A06
            if (r0 != 0) goto L_0x044f
            r5 = 8
        L_0x044f:
            r2.setVisibility(r5)
            com.instagram.common.ui.base.IgTextView r0 = r7.A0D
            r0.setVisibility(r1)
            r11.setVisibility(r1)
            r12.setVisibility(r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r7.A0F
            r2.A04()
            java.lang.String r0 = r4.A08
            X.C04220Ms.A0A(r0)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r0)
            X.0kW r0 = r9.A00
            r2.A09(r1, r0)
            android.graphics.drawable.Drawable r0 = r7.A01
            r2.setBottomBadgeDrawable(r0)
            r0 = 3
            float r0 = X.C09860go.A03(r3, r0)
            r2.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1l3.bind(X.MfV, X.M5O):void");
    }

    public AnonymousClass1l3(C11630kW r1, UserSession userSession, AnonymousClass3IU r3, AnonymousClass39C r4) {
        AnonymousClass0wJ.A1O(r3, userSession);
        this.A02 = r3;
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C202313q(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_fbcomment, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
