import ohnosequences.awstools.s3.ObjectAddress
import ohnosequences.nisperon.bundles.NisperonMetadataBuilder
import ohnosequences.metapasta._


object mockSamples {
  val testBucket = "metapasta-test"

  val ss1 = "SRR172902"
  val s1 = PairedSample(ss1, ObjectAddress(testBucket, "mock/" + ss1 + ".fastq"), ObjectAddress(testBucket, "mock/" + ss1 + ".fastq"))

  val ss2 = "SRR172903"
  val s2 = PairedSample(ss2, ObjectAddress(testBucket, "mock/" + ss2 + ".fastq"), ObjectAddress(testBucket, "mock/" + ss2 + ".fastq"))

  val samples = List(s1, s2)
}

object configuration extends MetapastaConfiguration (
  metadataBuilder = new NisperonMetadataBuilder(new generated.metadata.metatest()),
  email = "museeer@gmail.com",
  lastWorkers = 1,
  uploadWorkers = None,
  samples = mockSamples.samples
)

object metatest extends Metapasta(configuration) {


}
