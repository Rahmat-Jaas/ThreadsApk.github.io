package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchBlockV5MetadataQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class ArBlockMetadata extends TreeJNI implements C81204nM {

        public final class Blocks extends TreeJNI implements C81204nM {

            public final class BestInstance extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{AREffectBlockFragmentImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"block_id"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(BestInstance.class, "best_instance");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Blocks.class, "blocks");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ArBlockMetadata.class, "ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)");
    }
}
