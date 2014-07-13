package $name$

import ohnosequences.awstools.s3.ObjectAddress
import ohnosequences.nisperon.bundles.NisperonMetadataBuilder
import ohnosequences.metapasta._
import ohnosequences.awstools.autoscaling._
import ohnosequences.nisperon._
import ohnosequences.awstools.ec2._
import ohnosequences.metapasta.reporting._


object mockSamples {
  val testBucket = "metapasta-test"

  val ss1 = "supermock3"
  val s1 = PairedSample(ss1, ObjectAddress(testBucket, "mock/" + ss1 + ".fastq"), ObjectAddress(testBucket, "mock/" + ss1 + ".fastq"))

  val samples = List(s1)
  
  val t1 = SampleTag("t1")
  val tagging = Map(s1 -> List(t1))
}

object configuration extends BlastConfiguration (
  metadataBuilder = new NisperonMetadataBuilder(new generated.metadata.$name$()),
  defaultInstanceSpecs = NisperonConfiguration.defaultInstanceSpecs.copy(keyName = "nispero"),
  email = "$email$",
  password = "$password$",
  mappingWorkers = Group(size = 1, max = 100, instanceType = InstanceType.c1_medium, purchaseModel = SpotAuto),
  uploadWorkers = None,
  samples = mockSamples.samples,
  tagging = mockSamples.tagging,
  chunksThreshold = None, //use Some(n) for test configuration
  logging = true,
  blastTemplate = """blastn -task megablast -db $db$ -query $input$ -out $output$ -max_target_seqs 10 -num_threads 2 -outfmt $out_format$ -show_gis""",
  xmlOutput = false,
  assignmentConfiguration = AssignmentConfiguration(400, 0.8)
)

object $name$ extends Metapasta(configuration) {


}
