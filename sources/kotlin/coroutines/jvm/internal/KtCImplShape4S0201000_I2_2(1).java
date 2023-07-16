package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C27236EjA;

public class KtCImplShape4S0201000_I2_2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape4S0201000_I2_2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape4S0201000_I2_2) || ((KtCImplShape4S0201000_I2_2) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0070;
                case 2: goto L_0x007c;
                case 3: goto L_0x0088;
                case 4: goto L_0x0094;
                case 5: goto L_0x00a0;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00bd;
                case 8: goto L_0x01e9;
                case 9: goto L_0x00c9;
                case 10: goto L_0x00d6;
                case 11: goto L_0x012d;
                case 12: goto L_0x012d;
                case 13: goto L_0x01e9;
                case 14: goto L_0x01e9;
                case 15: goto L_0x00e2;
                case 16: goto L_0x01c6;
                case 17: goto L_0x01c6;
                case 18: goto L_0x00ee;
                case 19: goto L_0x00fd;
                case 20: goto L_0x0109;
                case 21: goto L_0x0115;
                case 22: goto L_0x0121;
                case 23: goto L_0x0011;
                case 24: goto L_0x012d;
                case 25: goto L_0x0139;
                case 26: goto L_0x01e9;
                case 27: goto L_0x01e9;
                case 28: goto L_0x01e9;
                case 29: goto L_0x01f5;
                case 30: goto L_0x0145;
                case 31: goto L_0x01e9;
                case 32: goto L_0x0150;
                case 33: goto L_0x015c;
                case 34: goto L_0x0168;
                case 35: goto L_0x0173;
                case 36: goto L_0x017e;
                case 37: goto L_0x0189;
                case 38: goto L_0x0194;
                case 39: goto L_0x019f;
                case 40: goto L_0x01ab;
                case 41: goto L_0x01b7;
                case 42: goto L_0x01e9;
                case 43: goto L_0x01c6;
                case 44: goto L_0x01d2;
                case 45: goto L_0x01de;
                case 46: goto L_0x01e9;
                case 47: goto L_0x01e9;
                case 48: goto L_0x01f5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape232S0100000_4_I2 r1 = (com.facebook.redex.IDxFCollectorShape232S0100000_4_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
        L_0x0010:
            return r2
        L_0x0011:
            r6.A01 = r7
            int r5 = r6.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r4
            r6.A00 = r5
            java.lang.Object r3 = r6.A02
            r2 = 23
            boolean r0 = A00(r2, r6)
            if (r0 == 0) goto L_0x0057
            r1 = r6
            r0 = r5 & r4
            if (r0 == 0) goto L_0x0057
            int r5 = r5 - r4
            r6.A00 = r5
        L_0x002c:
            java.lang.Object r2 = r1.A01
            int r1 = r1.A00
            r0 = 1
            if (r1 == 0) goto L_0x020b
            if (r1 != r0) goto L_0x0206
            X.AnonymousClass0OU.A00(r2)
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0046
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0201
            X.1jB r2 = X.AnonymousClass1jB.A01()
        L_0x0046:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x005c
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r0 = r2.A00
            X.1UH r0 = (X.AnonymousClass1UH) r0
            java.util.List r0 = r0.A00
            X.1jA r2 = X.AnonymousClass1jA.A00(r0)
            return r2
        L_0x0057:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r1 = X.C86124wJ.A15(r3, r6, r2)
            goto L_0x002c
        L_0x005c:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0010
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0065:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = (com.instagram.brandedcontent.repository.BrandedContentApi) r0
            java.lang.Object r2 = r0.A0E(r6)
            return r2
        L_0x0070:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A08(r0, r6)
            return r2
        L_0x007c:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A09(r0, r6)
            return r2
        L_0x0088:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A02(r0, r0, r6)
            return r2
        L_0x0094:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A05(r0, r0, r6)
            return r2
        L_0x00a0:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A06(r0, r0, r0, r6)
            return r2
        L_0x00ac:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = (com.instagram.brandedcontent.repository.BrandedContentApi) r0
            r1 = 0
            r7 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            java.lang.Object r2 = r0.A03(r1, r2, r3, r4, r5, r6, r7)
            return r2
        L_0x00bd:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A0A(r0, r6)
            return r2
        L_0x00c9:
            java.lang.Object r2 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r2 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r2
            r1 = 0
            r0 = 0
            java.lang.Object r2 = r2.A00(r1, r6, r0)
            return r2
        L_0x00d6:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r1 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A02(r6, r0)
            return r2
        L_0x00e2:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape83S0200000_1_I2 r1 = (com.facebook.redex.IDxFCollectorShape83S0200000_1_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
            return r2
        L_0x00ee:
            java.lang.Object r2 = X.C86104wH.A0o(r7, r6)
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r2 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r2
            r1 = 0
            r3 = r1
            r4 = r1
            r5 = r1
            java.lang.Object r2 = com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A00(r1, r2, r3, r4, r5, r6)
            return r2
        L_0x00fd:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r1 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r1
            r0 = 0
            java.lang.Object r2 = com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A03(r1, r0, r0, r0, r6)
            return r2
        L_0x0109:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler r1 = (com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r0, r6)
            return r2
        L_0x0115:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler r1 = (com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r0, r6)
            return r2
        L_0x0121:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r1 = (com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r6)
            return r2
        L_0x012d:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r1 = (com.facebook.redex.IDxFCollectorShape84S0200000_2_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
            return r2
        L_0x0139:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            androidx.paging.PagingSource r1 = (androidx.paging.PagingSource) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r6)
            return r2
        L_0x0145:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = (com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource) r0
            java.lang.Object r2 = r0.A0B(r6)
            return r2
        L_0x0150:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = (com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource) r1
            r0 = 0
            java.lang.Object r2 = r1.A0A(r0, r6)
            return r2
        L_0x015c:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = (com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource) r1
            r0 = 0
            java.lang.Object r2 = r1.A05(r0, r6)
            return r2
        L_0x0168:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource r0 = (com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource) r0
            java.lang.Object r2 = r0.A02(r6)
            return r2
        L_0x0173:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r0 = (com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob) r0
            java.lang.Object r2 = com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.A00(r0, r6)
            return r2
        L_0x017e:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob r0 = (com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob) r0
            java.lang.Object r2 = com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob.A00(r0, r6)
            return r2
        L_0x0189:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.related.RelatedClipsRepository r0 = (com.instagram.clips.related.RelatedClipsRepository) r0
            java.lang.Object r2 = com.instagram.clips.related.RelatedClipsRepository.A00(r0, r6)
            return r2
        L_0x0194:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.clips.related.RelatedClipsRepository r0 = (com.instagram.clips.related.RelatedClipsRepository) r0
            java.lang.Object r2 = com.instagram.clips.related.RelatedClipsRepository.A01(r0, r6)
            return r2
        L_0x019f:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            androidx.paging.PagingSource r1 = (androidx.paging.PagingSource) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r6)
            return r2
        L_0x01ab:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape231S0100000_3_I2 r1 = (com.facebook.redex.IDxFCollectorShape231S0100000_3_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
            return r2
        L_0x01b7:
            r6.A02 = r7
            int r1 = r6.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r6.A00 = r1
            r0 = 0
            java.lang.Object r2 = com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt.A00(r0, r0, r6)
            return r2
        L_0x01c6:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape229S0100000_1_I2 r1 = (com.facebook.redex.IDxFCollectorShape229S0100000_1_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
            return r2
        L_0x01d2:
            java.lang.Object r1 = X.C86104wH.A0o(r7, r6)
            com.instagram.contentmanagement.api.ContentManagementDraftsApi r1 = (com.instagram.contentmanagement.api.ContentManagementDraftsApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r6)
            return r2
        L_0x01de:
            java.lang.Object r0 = X.C86104wH.A0o(r7, r6)
            com.instagram.contentmanagement.api.ContentManagementDraftsApi r0 = (com.instagram.contentmanagement.api.ContentManagementDraftsApi) r0
            java.lang.Object r2 = r0.A01(r6)
            return r2
        L_0x01e9:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = (com.facebook.redex.IDxFCollectorShape230S0100000_2_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
            return r2
        L_0x01f5:
            java.lang.Object r1 = X.C86124wJ.A0q(r7, r6)
            com.facebook.redex.IDxFCollectorShape86S0200000_4_I2 r1 = (com.facebook.redex.IDxFCollectorShape86S0200000_4_I2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r6)
            return r2
        L_0x0201:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0206:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x020b:
            X.AnonymousClass0OU.A00(r2)
            java.lang.String r0 = "getMaxItems"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape4S0201000_I2_2(C146958n9 r2) {
        super(r2);
        this.A03 = 41;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape4S0201000_I2_2(Object obj, C146958n9 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }
}
