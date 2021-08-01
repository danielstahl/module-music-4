package net.soundmining

import net.soundmining.modular.ModularSynth._
import net.soundmining.synth.Instrument.{LINEAR, TAIL_ACTION}
import net.soundmining.synth.{Instrument, SuperColliderClient}
import net.soundmining.synth.SuperColliderClient.loadDir
import net.soundmining.synth.Utils.absoluteTimeToMillis
import net.soundmining.Spectrum._
import net.soundmining.modular.ModularInstrument.ControlInstrument
import net.soundmining.sound.{SoundPlay, SoundPlays}

object ModuleMusic4 {
  implicit val client: SuperColliderClient = SuperColliderClient()
  val SYNTH_DIR = "/Users/danielstahl/Documents/Projects/soundmining-modular/src/main/sc/synths"
  val SOUND_DIR = "/Users/danielstahl/Documents/Music/sounds/Concrete Music 7_sounds/rendered_audio"

  val LONG_BEAN_RATTLE_1 = "long-bean-rattle-1"
  val LONG_BEAN_RATTLE_2 = "long-bean-rattle-2"
  val SHORT_BEAN_RATTLE_1 = "short-bean-rattle-1"
  val SHORT_BEAN_RATTLE_2 = "short-bean-rattle-2"

  val soundPlays = SoundPlays(
    soundPlays = Map(
      LONG_BEAN_RATTLE_1 -> SoundPlay(s"$SOUND_DIR/Long bean rattle 1.flac", 0.00, 1.723),
      LONG_BEAN_RATTLE_2 -> SoundPlay(s"$SOUND_DIR/Long bean rattle 2.flac", 0.095, 1.881),
      SHORT_BEAN_RATTLE_1 -> SoundPlay(s"$SOUND_DIR/Short bean rattle 1.flac", 0.110, 0.475),
      SHORT_BEAN_RATTLE_2 -> SoundPlay(s"$SOUND_DIR/Short bean rattle 2.flac", 0.087, 0.466)
    ))

  def init(): Unit = {
    println("Starting up SuperCollider client")
    client.start
    Instrument.setupNodes(client)
    client.send(loadDir(SYNTH_DIR))
    soundPlays.init
  }

  def playRattleIntro(): Unit = {
    client.resetClock

    soundPlays.mono(LONG_BEAN_RATTLE_1)
      .playMono(0.5, 1)
      .pan(-0.5, 0.5)
      .play(0, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_2)
      .playMono(1, 1)
      .pan(0.7, -0.2)
      .play(2, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(1.0, 1)
      .pan(-0.5)
      .play(4, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(1.0, 1)
      .pan(0.5)
      .play(4, 0)
  }

  def playRattleOutro(): Unit = {
    client.resetClock

    soundPlays.mono(LONG_BEAN_RATTLE_1)
      .playMono(0.5, 1)
      .pan(-0.5, 0.5)
      .play(0, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_2)
      .playMono(1, 1)
      .pan(0.7, -0.2)
      .play(2, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(1.0, 1)
      .pan(-0.5)
      .play(4, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(1.0, 1)
      .pan(0.5)
      .play(4, 0)
  }

  def playRattleDevelopment(): Unit = {
    client.resetClock

    soundPlays.mono(LONG_BEAN_RATTLE_1)
      .playMono(0.1, 1)
      .pan(-0.5, 0.5)
      .play(0, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_1)
      .playMono(0.3, 1)
      .pan(0.5, -0.5)
      .play(5, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_1)
      .playMono(0.5, 1)
      .pan(-0.5, 0.5)
      .play(8, 0)


    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(1.0, 1)
      .pan(-0.5)
      .play(10, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(1.0, 1)
      .pan(0.5)
      .play(10, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(1.0, 1)
      .pan(-0.5)
      .play(15, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(1.0, 1)
      .pan(0.5)
      .play(15, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(0.1, 1)
      .pan(-0.5)
      .play(15, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(0.1, 1)
      .pan(0.5)
      .play(15, 0)


    soundPlays.mono(LONG_BEAN_RATTLE_2)
      .playMono(0.1, 1)
      .pan(-0.3, 0.2)
      .play(20, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_2)
      .playMono(0.3, 1)
      .pan(0.3, -0.2)
      .play(27, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_2)
      .playMono(0.5, 1)
      .pan(-0.3, 0.2)
      .play(29, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(0.1, 1)
      .pan(-0.5)
      .play(34, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(0.1, 1)
      .pan(0.5)
      .play(34, 0)


    soundPlays.mono(LONG_BEAN_RATTLE_1)
      .playMono(0.5, 1)
      .pan(-0.5, 0.5)
      .play(37, 0)

    soundPlays.mono(LONG_BEAN_RATTLE_2)
      .playMono(1, 1)
      .pan(0.7, -0.2)
      .play(39, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_1)
      .playMono(1.0, 1)
      .pan(-0.5)
      .play(41, 0)

    soundPlays.mono(SHORT_BEAN_RATTLE_2)
      .playMono(1.0, 1)
      .pan(0.5)
      .play(41, 0)
  }

  def makeSpectrum(triplet: (Double, Double, Double)): Seq[Double] =
    triplet match {
      case (carrier, modulator, fact) => makeSpectrum2(carrier, fact, 50)
    }

  def playFmNote(carrier: Double, modulator: Double, startTime: Double, duration: Double = 10,
                 modAmount: () => ControlInstrument = () => lineControl(300, 3000),
                 volume: () => ControlInstrument = () => relativePercControl(0, 0.25, 0.5, Right(LINEAR)),
                 panPos: () => ControlInstrument = () => staticControl(0)): Unit = {
    val fm = fmSineModulate(staticControl(carrier), sineOsc(modAmount(), staticControl(modulator)), volume())
      .addAction(TAIL_ACTION)

    val pan = panning(fm, panPos())
      .addAction(TAIL_ACTION).withNrOfChannels(2)

    pan.getOutputBus.staticBus(0)

    val graph = pan.buildGraph(startTime, duration, pan.graph(Seq()))

    client.send(client.newBundle(absoluteTimeToMillis(startTime), graph))
  }

  def playPulseFmNote(carrier: Double, modulator: Double, startTime: Double, duration: Double = 10,
                 modAmount: () => ControlInstrument = () => lineControl(300, 3000),
                 volume: () => ControlInstrument = () => relativePercControl(0, 0.15, 0.66, Right(LINEAR)),
                 panPos: () => ControlInstrument = () => staticControl(0)): Unit = {

    val fm = fmSawModulate(staticControl(carrier + -0.05), sineOsc(modAmount(), staticControl(modulator + 0.05)), volume())
      .addAction(TAIL_ACTION)

    val pan = panning(fm, panPos())
      .addAction(TAIL_ACTION).withNrOfChannels(2)

    pan.getOutputBus.staticBus(0)

    val graph = pan.buildGraph(startTime, duration, pan.graph(Seq()))

    client.send(client.newBundle(absoluteTimeToMillis(startTime), graph))

  }

  val series = Seq(
    ("c4", "giss4"),
    ("g3", "h4"),
    ("d4", "aiss4"),
    ("a3", "ciss5"),
    ("e3", "g4"),
    ("h2", "diss4"),
    ("fiss3", "a3"),
    ("ciss3", "f4"),
    ("giss3", "h3"),
    ("diss3", "c4"),
    ("aiss2", "g4"),
    ("f2", "a4"))
    .map {
      case (carrier, modulator) => (Note.noteToHertz(carrier), Note.noteToHertz(modulator))
    }
    .map {
      case (carrier, modulator) => (carrier, modulator, makeFact(carrier, modulator))
    }
    .sliding(3, 3).toSeq

  // Fibonacci
  // 1 1 2 3 5 8 13 21 34 55
  // Time
  // 3 5 3 5 2 3 5 3
  // 21 34 21 34 13 21 32 21
  // Duration
  // 5 8 5 8 3 5 8 5
  // 34 55 34 55 21 34 55 34
  // Melody
  // 2 4 6 5 10 8 3 1

  val melody = Seq(2, 4, 6, 5, 10, 8, 3, 1)
  val times = Seq(21, 34, 21, 34, 13, 21, 32, 21)
  val durations = Seq(34, 55, 34, 55, 21, 34, 55, 34)

  val secondMelody = Seq(1, 3, 6)

  val lowToHighMod = (low: Double, high: Double) => () => lineControl(low, high)
  val highToLowMod = (low: Double, high: Double) => () => lineControl(high, low)
  val modAmounts = Seq(lowToHighMod, highToLowMod, lowToHighMod, highToLowMod, lowToHighMod, highToLowMod, lowToHighMod, highToLowMod)

  val middlePan = (panPos: Double) => () => staticControl(panPos)
  val leftPan = (panPos: Double) => () => staticControl(panPos - 0.2)
  val rightPan = (panPos: Double) => () => staticControl(panPos + 0.2)
  val middleToLeft = (panPos: Double) => () => lineControl(panPos, panPos - 0.2)
  val middleToRight = (panPos: Double) => () => lineControl(panPos, panPos + 0.2)
  val leftToMiddle = (panPos: Double) => () => lineControl(panPos - 0.2, panPos)
  val rightToMiddle = (panPos: Double) => () => lineControl(panPos + 0.2, panPos)
  val leftToRight = (panPos: Double) => () => lineControl(panPos - 0.2, panPos + 0.2)
  val rightToLeft = (panPos: Double) => () => lineControl(panPos + 0.2, panPos - 0.2)

  val pans = Seq(middlePan, middleToLeft, leftToRight, rightToLeft, leftToMiddle, middleToRight, rightToLeft, leftToMiddle)

  def makeTime(relative: Int, millis: Double): Double =
    (millis * relative) / 1000

  def playFirstFmMelody(absTimes: (Int, Int, Int) = (2, 2, 2), lowMod: Double = 300, highMod: Double = 3000): Unit = {
    playFmMelody(series.head, absTimes = absTimes, lowMod = lowMod, highMod = highMod, rattle = false)
  }

  def playSecondFmMelody(absTimes: (Int, Int, Int) = (1, 2, 2), lowMod: Double = 200, highMod: Double = 5000): Unit = {
    playFmMelody(series(1), absTimes = absTimes, lowMod = lowMod, highMod = highMod, rattle = true)
  }

  def playThirdFmMelody(absTimes: (Int, Int, Int) = (8, 2, 7), lowMod: Double = 300, highMod: Double = 3000): Unit = {
    playFmMelody(series(2), absTimes = absTimes, lowMod = lowMod, highMod = highMod)
  }

  def playFmMelody(oneSeries: Seq[(Double, Double, Double)], absTimes: (Int, Int, Int) = (2, 2, 2), lowMod: Double = 300, highMod: Double = 3000, rattle: Boolean = false): Unit = {
    client.resetClock

    val firstSeries = oneSeries
    println(s"first series $firstSeries")

    val firstTriplet = firstSeries.head
    val secondTriplet = firstSeries(1)
    val thirdTriplet = firstSeries(2)

    val firstSpectrum = makeSpectrum(firstTriplet)
    val secondSpectrum = makeSpectrum(secondTriplet)
    val thirdSpectrum = makeSpectrum(thirdTriplet)

    println(s"first spectrum $firstSpectrum")
    println(s"second spectrum $secondSpectrum")
    println(s"third spectrum $thirdSpectrum")

    val firstTimes = Melody.absolute(0, times.map(rel => makeTime(rel, firstSpectrum(absTimes._1))))
    val firstDurations = durations.map(rel => makeTime(rel, firstSpectrum(absTimes._1)))

    val secondTimes = Melody.absolute(makeTime(21, secondSpectrum(absTimes._2)), times.map(rel => makeTime(rel, secondSpectrum(2))))
    val secondDurations = durations.map(rel => makeTime(rel, secondSpectrum(absTimes._2)))

    val thirdTimes = Melody.absolute(makeTime(34, thirdSpectrum(absTimes._3)), times.map(rel => makeTime(rel, thirdSpectrum(2))))
    val thirdDurations = durations.map(rel => makeTime(rel, thirdSpectrum(absTimes._3)))

    println(s"abs time1 ${firstSpectrum(absTimes._1)} time2 ${secondSpectrum(absTimes._2)} time 3 ${thirdSpectrum(absTimes._3)}")
    println(s"first times $firstTimes")
    println(s"second times $secondTimes")
    println(s"third times $thirdTimes")

    melody.zipWithIndex.foreach {
      case (note, i) => playFmNote(firstSpectrum(note), firstSpectrum(note) * firstTriplet._3, firstTimes(i), firstDurations(i), modAmount = modAmounts(i)(lowMod, highMod), panPos = pans(i)(-0.7))
    }

    melody.zipWithIndex.foreach {
      case (note, i) if secondMelody.contains(i) =>
        playPulseFmNote(firstSpectrum(note), firstSpectrum(note) * firstTriplet._3, firstTimes(i), firstDurations(i), modAmount = modAmounts(i)(lowMod, highMod), panPos = pans(i)(-0.8))
      case (note, i) =>

    }

    melody.zipWithIndex.foreach {
      case (note, i) => playFmNote(secondSpectrum(note), secondSpectrum(note) * secondTriplet._3, secondTimes(i), secondDurations(i), modAmount = modAmounts(i)(lowMod, highMod), panPos = pans(i)(0))
    }

    melody.zipWithIndex.foreach {
      case (note, i) if secondMelody.contains(i) =>
        playPulseFmNote(secondSpectrum(note), secondSpectrum(note) * secondTriplet._3, secondTimes(i), secondDurations(i), modAmount = modAmounts(i)(lowMod, highMod), panPos = pans(i)(0.1))
      case (note, i) =>

    }

    if(rattle) {
      soundPlays.mono(SHORT_BEAN_RATTLE_1)
        .playMono(0.1, 2)
        .pan(-0.5)
        .play(secondTimes(5), 0)

      soundPlays.mono(SHORT_BEAN_RATTLE_2)
        .playMono(0.1, 2)
        .pan(0.5)
        .play(secondTimes(5), 0)
    }

    melody.zipWithIndex.foreach {
      case (note, i) => playFmNote(thirdSpectrum(note), thirdSpectrum(note) * thirdTriplet._3, thirdTimes(i), thirdDurations(i), modAmount = modAmounts(i)(lowMod, highMod), panPos = pans(i)(0.7))
    }

    melody.zipWithIndex.foreach {
      case (note, i) if secondMelody.contains(i) =>
        playPulseFmNote(thirdSpectrum(note), thirdSpectrum(note) * thirdTriplet._3, thirdTimes(i), thirdDurations(i), modAmount = modAmounts(i)(lowMod, highMod), panPos = pans(i)(0.8))
      case (note, i) =>
    }


  }

  def testSaw(): Unit = {

    client.resetClock

    val startTime = 0
    val dur = 10
    val saw = sawOsc(relativePercControl(0, 1, 0.1, Right(LINEAR)), staticControl(55))

    val filtered = moogFilter(saw, lineControl(110, 3000), staticControl(1)).addAction(TAIL_ACTION)

    val pan = panning(filtered, staticControl(0))
      .addAction(TAIL_ACTION).withNrOfChannels(2)

    pan.getOutputBus.staticBus(0)

    val graph = pan.buildGraph(startTime, dur, pan.graph(Seq()))

    client.send(client.newBundle(absoluteTimeToMillis(startTime), graph))
  }

  def stop(): Unit = {
    println("Stopping SuperCollider client")
    client.stop
  }
}
