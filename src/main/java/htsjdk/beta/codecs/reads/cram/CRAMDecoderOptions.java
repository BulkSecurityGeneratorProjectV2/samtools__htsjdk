package htsjdk.beta.codecs.reads.cram;

import htsjdk.io.IOPath;
import htsjdk.samtools.cram.ref.CRAMReferenceSource;

import java.util.Optional;

/**
 * Decoder options for CRAM decoders.
 *
 * NOTE: Currently this doesn't implement any specific options, and is just to illustrate the
 * ability to pass custom options to codecs that can use them.
 */
public class CRAMDecoderOptions {
    private CRAMReferenceSource referenceSource;
    private IOPath referencePath;

    public Optional<CRAMReferenceSource> getReferenceSource() {
        return Optional.ofNullable(referenceSource);
    }

    // Mutually exclusive with setReferencePath
    public CRAMDecoderOptions setReferenceSource(final CRAMReferenceSource referenceSource) {
        this.referencePath = null;  // // path is mutually exclusive with setReferenceSource
        this.referenceSource = referenceSource;
        return this;
    }

    public Optional<IOPath> getReferencePath() {
        return Optional.ofNullable(referencePath);
    }

    // Mutually exclusive with setReferenceSource
    public CRAMDecoderOptions setReferencePath(final IOPath referencePath) {
        this.referenceSource = null; // path is mutually exclusive with setReferenceSource
        this.referencePath = referencePath;
        return this;
    }

}
