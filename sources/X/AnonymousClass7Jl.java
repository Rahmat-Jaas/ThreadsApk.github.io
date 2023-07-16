package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.graphql.impls.StatusInfoDetailsImpl;
import com.facebook.graphql.impls.SummaryDetailsImpl;
import com.facebook.graphql.impls.TimelineEventImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape508S0100000_2_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.7Jl  reason: invalid class name */
public final class AnonymousClass7Jl {
    public static final AnonymousClass7Jl A00 = new AnonymousClass7Jl();

    public static final void A00(PAYTextWithLinksFragmentImpl pAYTextWithLinksFragmentImpl, ImmutableList.Builder builder, AnonymousClass0YY r13) {
        if (pAYTextWithLinksFragmentImpl != null) {
            AnonymousClass5iR A002 = AnonymousClass5iR.A00(30);
            A002.A05 = C121777Ib.A01(new C128087ir(pAYTextWithLinksFragmentImpl, new IDxCListenerShape508S0100000_2_I2(r13, 0)), C92375iF.A00(), AnonymousClass69Q.A15);
            A002.A02 = 1;
            A002.A03 = C86164wN.A0L(pAYTextWithLinksFragmentImpl, r13, 20);
            C121187Eo r3 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
            r3.A01 = C128107it.A00(pAYTextWithLinksFragmentImpl, "text");
            r3.A04 = true;
            AnonymousClass7E5.A01(r3, A002, builder);
        }
    }

    public static final void A03(ImmutableList.Builder builder, String str) {
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(28);
        A002.A05 = C121777Ib.A01(C128107it.A01(str), C92375iF.A00(), AnonymousClass69Q.A0F);
        A002.A02 = 1;
        C121187Eo r4 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        r4.A01 = C128107it.A01(str);
        r4.A05 = true;
        AnonymousClass7E5.A01(r4, A002, builder);
    }

    public static final boolean A04(SummaryDetailsImpl summaryDetailsImpl, ImmutableList.Builder builder) {
        String str;
        String str2;
        String str3;
        String str4;
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(17);
        C92375iF A003 = C92375iF.A00();
        String str5 = null;
        if (summaryDetailsImpl != null) {
            str = summaryDetailsImpl.getStringValue("total_amount");
        } else {
            str = null;
        }
        C128107it A01 = C128107it.A01(str);
        AnonymousClass69Q r1 = AnonymousClass69Q.A0G;
        C121777Ib.A02(A01, A003, r1);
        if (summaryDetailsImpl != null) {
            str2 = C86164wN.A0g(summaryDetailsImpl);
        } else {
            str2 = null;
        }
        C121777Ib.A03(A003, r1, str2);
        if (summaryDetailsImpl != null) {
            str3 = summaryDetailsImpl.getStringValue(DatePickerDialogModule.ARG_DATE);
        } else {
            str3 = null;
        }
        A003.A03 = new C121777Ib((C146998nD) null, C128107it.A01(str3), AnonymousClass69Q.A0z);
        if (summaryDetailsImpl != null) {
            str4 = summaryDetailsImpl.getStringValue(DevServerEntity.COLUMN_DESCRIPTION);
        } else {
            str4 = null;
        }
        A003.A01 = new C121777Ib((C146998nD) null, C128107it.A01(str4), AnonymousClass69Q.A0E);
        C121187Eo r5 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        if (summaryDetailsImpl != null) {
            str5 = summaryDetailsImpl.getStringValue("accessibility_label");
        }
        r5.A01 = C128107it.A01(str5);
        AnonymousClass7E5.A00(r5, A003);
        A002.A05 = new AnonymousClass5iL(A003);
        A002.A02 = 1;
        C92465iX.A01(A002, builder);
        if (summaryDetailsImpl == null || summaryDetailsImpl.getStringValue("total_amount") == null || C86164wN.A0g(summaryDetailsImpl) == null || summaryDetailsImpl.getStringValue(DatePickerDialogModule.ARG_DATE) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        if (r1 != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(com.facebook.graphql.impls.InfoDetailsImpl r22, com.google.common.collect.ImmutableList.Builder r23) {
        /*
            r21 = this;
            r14 = 0
            r8 = r22
            if (r22 == 0) goto L_0x008e
            java.lang.String r0 = "section_title"
            java.lang.String r0 = r8.getStringValue(r0)
        L_0x000b:
            r7 = r23
            A03(r7, r0)
            if (r22 == 0) goto L_0x009e
            java.lang.Class<com.facebook.graphql.impls.InfoDetailsImpl$InfoItems> r6 = com.facebook.graphql.impls.InfoDetailsImpl.InfoItems.class
            java.lang.String r5 = "info_items"
            com.google.common.collect.ImmutableList r0 = r8.getTreeList(r5, r6)
            if (r0 == 0) goto L_0x0091
            java.util.Iterator r12 = r0.iterator()
        L_0x0020:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0091
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r12)
            if (r2 == 0) goto L_0x008a
            java.lang.String r1 = X.C86154wM.A0j(r2)
            java.lang.String r0 = "value"
            java.lang.String r11 = r2.getStringValue(r0)
            java.lang.String r0 = "accessibility_label"
            java.lang.String r10 = r2.getStringValue(r0)
        L_0x003c:
            r0 = 29
            X.5iR r4 = X.AnonymousClass5iR.A00(r0)
            X.5iF r2 = X.C92375iF.A00()
            X.7it r0 = X.C128107it.A01(r1)
            X.69Q r9 = X.AnonymousClass69Q.A0l
            X.C121777Ib.A02(r0, r2, r9)
            r3 = 0
            r2.A03 = r3
            X.5iL r1 = new X.5iL
            r1.<init>(r2)
            r2 = 1
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.A04 = r1
            r4.A01 = r2
            r4.A00 = r0
            X.5iF r1 = X.C92375iF.A00()
            X.7it r0 = X.C128107it.A01(r11)
            X.5iL r0 = X.C121777Ib.A01(r0, r1, r9)
            r4.A05 = r0
            r4.A02 = r2
            r17 = 127(0x7f, float:1.78E-43)
            X.7Eo r13 = new X.7Eo
            r15 = r14
            r16 = r14
            r19 = r3
            r20 = r3
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.7it r0 = X.C128107it.A01(r10)
            r13.A01 = r0
            X.AnonymousClass7E5.A01(r13, r4, r7)
            goto L_0x0020
        L_0x008a:
            r1 = r14
            r11 = r14
            r10 = r14
            goto L_0x003c
        L_0x008e:
            r0 = r14
            goto L_0x000b
        L_0x0091:
            com.google.common.collect.ImmutableList r0 = r8.getTreeList(r5, r6)
            if (r0 == 0) goto L_0x009e
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x009f
        L_0x009e:
            r0 = 1
        L_0x009f:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Jl.A05(com.facebook.graphql.impls.InfoDetailsImpl, com.google.common.collect.ImmutableList$Builder):boolean");
    }

    public static final void A01(StatusInfoDetailsImpl statusInfoDetailsImpl, ImmutableList.Builder builder, AnonymousClass0YY r9) {
        TimelineEventImpl timelineEventImpl;
        TimelineEventImpl timelineEventImpl2;
        if (statusInfoDetailsImpl != null) {
            A03(builder, statusInfoDetailsImpl.getStringValue("section_title"));
            Class<StatusInfoDetailsImpl.StatusTimelineEvents> cls = StatusInfoDetailsImpl.StatusTimelineEvents.class;
            TreeJNI treeJNI = (TreeJNI) AnonymousClass00J.A0G(C18230wP.A0P(statusInfoDetailsImpl, cls, "status_timeline_events"), 0);
            TimelineEventImpl timelineEventImpl3 = null;
            if (treeJNI != null) {
                timelineEventImpl = (TimelineEventImpl) treeJNI.reinterpret(TimelineEventImpl.class);
            } else {
                timelineEventImpl = null;
            }
            TreeJNI treeJNI2 = (TreeJNI) AnonymousClass00J.A0G(C18230wP.A0P(statusInfoDetailsImpl, cls, "status_timeline_events"), 1);
            if (treeJNI2 != null) {
                timelineEventImpl2 = (TimelineEventImpl) treeJNI2.reinterpret(TimelineEventImpl.class);
            } else {
                timelineEventImpl2 = null;
            }
            TreeJNI treeJNI3 = (TreeJNI) AnonymousClass00J.A0G(C18230wP.A0P(statusInfoDetailsImpl, cls, "status_timeline_events"), 2);
            if (treeJNI3 != null) {
                timelineEventImpl3 = (TimelineEventImpl) treeJNI3.reinterpret(TimelineEventImpl.class);
            }
            A02(timelineEventImpl, timelineEventImpl2, builder, r9);
            A02(timelineEventImpl2, timelineEventImpl3, builder, r9);
            A02(timelineEventImpl3, (TimelineEventImpl) null, builder, r9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (X.AnonymousClass8bQ.A0n(r9) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r1 != 2) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.facebook.graphql.impls.TimelineEventImpl r23, com.facebook.graphql.impls.TimelineEventImpl r24, com.google.common.collect.ImmutableList.Builder r25, X.AnonymousClass0YY r26) {
        /*
            r11 = r23
            if (r23 == 0) goto L_0x0175
            java.lang.Class<com.facebook.graphql.impls.TimelineEventImpl$Description> r12 = com.facebook.graphql.impls.TimelineEventImpl.Description.class
            java.lang.String r10 = "description"
            com.facebook.pando.TreeJNI r1 = r11.getTreeValue(r10, r12)
            r2 = 0
            if (r1 == 0) goto L_0x0194
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl> r0 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.class
            com.facebook.pando.TreeJNI r3 = r1.reinterpret(r0)
            if (r3 == 0) goto L_0x0194
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl$Ranges> r1 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.Ranges.class
            java.lang.String r0 = "ranges"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0194
            java.lang.Object r3 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x0194
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl$Ranges$Entity> r1 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.Ranges.Entity.class
            java.lang.String r0 = "entity"
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0194
            java.lang.String r0 = "url"
            java.lang.String r9 = r1.getStringValue(r0)
        L_0x0039:
            r13 = 1
            if (r9 == 0) goto L_0x0043
            boolean r1 = X.AnonymousClass8bQ.A0n(r9)
            r0 = 0
            if (r1 == 0) goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            r16 = r0 ^ 1
            r0 = 25
            X.5iR r8 = X.AnonymousClass5iR.A00(r0)
            X.5iE r7 = new X.5iE
            r7.<init>()
            java.lang.Class<com.facebook.graphql.impls.TimelineEventImpl$Icon> r6 = com.facebook.graphql.impls.TimelineEventImpl.Icon.class
            java.lang.String r5 = "icon"
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r5, r6)
            if (r3 == 0) goto L_0x0191
            X.1zi r1 = X.C30031zi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "color_enum"
            java.lang.Enum r4 = X.C86104wH.A0a(r3, r1, r0)
            X.1zi r4 = (X.C30031zi) r4
        L_0x0065:
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r5, r6)
            if (r3 == 0) goto L_0x018e
            X.66W r1 = X.AnonymousClass66W.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "name_enum"
            java.lang.Enum r15 = X.C86104wH.A0a(r3, r1, r0)
            X.66W r15 = (X.AnonymousClass66W) r15
        L_0x0075:
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r5, r6)
            if (r3 == 0) goto L_0x018b
            X.1zj r1 = X.C30041zj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "size_enum"
            java.lang.Enum r3 = X.C86104wH.A0a(r3, r1, r0)
            X.1zj r3 = (X.C30041zj) r3
        L_0x0085:
            com.facebook.pando.TreeJNI r14 = r11.getTreeValue(r5, r6)
            if (r14 == 0) goto L_0x0188
            X.1zk r1 = X.C30051zk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "variant_enum"
            java.lang.Enum r14 = X.C86104wH.A0a(r14, r1, r0)
            X.1zk r14 = (X.C30051zk) r14
        L_0x0095:
            if (r15 == 0) goto L_0x00a2
            int r1 = r15.ordinal()
            r15 = 1
            r0 = 4
            if (r1 == r0) goto L_0x0181
            r0 = 2
            if (r1 == r0) goto L_0x0182
        L_0x00a2:
            r15 = 0
        L_0x00a3:
            java.lang.Integer r4 = X.AnonymousClass6IS.A00(r4)
            if (r3 == 0) goto L_0x017e
            int r1 = r3.ordinal()
            r0 = 3
            if (r1 != r0) goto L_0x017e
            java.lang.Integer r3 = X.C86154wM.A0X()
        L_0x00b4:
            if (r14 == 0) goto L_0x017b
            int r1 = r14.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x017b
            java.lang.Integer r1 = X.C18220wO.A0d()
        L_0x00c1:
            X.7iJ r0 = new X.7iJ
            r0.<init>(r15, r4, r3, r1)
            r7.A00 = r0
            r0 = r24
            if (r24 != 0) goto L_0x00cd
            r13 = 0
        L_0x00cd:
            r7.A02 = r13
            if (r24 == 0) goto L_0x0178
            com.facebook.pando.TreeJNI r3 = r0.getTreeValue(r5, r6)
            if (r3 == 0) goto L_0x0178
            X.1zi r1 = X.C30031zi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "color_enum"
            java.lang.Enum r0 = X.C86104wH.A0a(r3, r1, r0)
            X.1zi r0 = (X.C30031zi) r0
        L_0x00e1:
            java.lang.Integer r0 = X.AnonymousClass6IS.A00(r0)
            r7.A01 = r0
            r3 = 0
            r7.A03 = r3
            X.5iK r4 = new X.5iK
            r4.<init>(r7)
            r18 = 0
            r1 = 2
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.A04 = r4
            r8.A01 = r1
            r8.A00 = r0
            X.5iF r7 = X.C92375iF.A00()
            java.lang.String r0 = "title"
            X.7it r1 = X.C128107it.A00(r11, r0)
            X.69Q r0 = X.AnonymousClass69Q.A0l
            X.C121777Ib.A02(r1, r7, r0)
            java.lang.String r0 = "subtitle"
            X.7it r1 = X.C128107it.A00(r11, r0)
            X.69Q r6 = X.AnonymousClass69Q.A0z
            X.7Ib r0 = new X.7Ib
            r0.<init>(r2, r1, r6)
            r7.A02 = r0
            com.facebook.pando.TreeJNI r1 = r11.getTreeValue(r10, r12)
            if (r1 == 0) goto L_0x0176
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl> r0 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.class
            com.facebook.pando.TreeJNI r5 = r1.reinterpret(r0)
            com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl r5 = (com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl) r5
        L_0x0126:
            r4 = 1
            com.facebook.redex.IDxCListenerShape508S0100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape508S0100000_2_I2
            r10 = r26
            r0.<init>(r10, r4)
            X.7ir r1 = new X.7ir
            r1.<init>(r5, r0)
            X.7Ib r0 = new X.7Ib
            r0.<init>(r2, r1, r6)
            r7.A03 = r0
            r7.A03 = r3
            X.AnonymousClass5iL.A01(r8, r7, r4)
            if (r16 == 0) goto L_0x014f
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape6S1100000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape6S1100000_I2
            r1.<init>(r9, r10, r0)
            r0 = 15
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r2.<init>((int) r0, (X.AnonymousClass0YY) r1)
        L_0x014f:
            r8.A03 = r2
            r21 = 127(0x7f, float:1.78E-43)
            X.7Eo r1 = new X.7Eo
            r17 = r1
            r19 = r18
            r20 = r18
            r22 = r3
            r23 = r3
            r24 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = "accessibility_label"
            X.7it r0 = X.C128107it.A00(r11, r0)
            r1.A01 = r0
            r0 = r16
            r1.A04 = r0
            r0 = r25
            X.AnonymousClass7E5.A01(r1, r8, r0)
        L_0x0175:
            return
        L_0x0176:
            r5 = r2
            goto L_0x0126
        L_0x0178:
            r0 = r2
            goto L_0x00e1
        L_0x017b:
            r1 = 0
            goto L_0x00c1
        L_0x017e:
            r3 = 0
            goto L_0x00b4
        L_0x0181:
            r15 = 0
        L_0x0182:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x00a3
        L_0x0188:
            r14 = r2
            goto L_0x0095
        L_0x018b:
            r3 = r2
            goto L_0x0085
        L_0x018e:
            r15 = r2
            goto L_0x0075
        L_0x0191:
            r4 = r2
            goto L_0x0065
        L_0x0194:
            r9 = r2
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Jl.A02(com.facebook.graphql.impls.TimelineEventImpl, com.facebook.graphql.impls.TimelineEventImpl, com.google.common.collect.ImmutableList$Builder, X.0YY):void");
    }
}
