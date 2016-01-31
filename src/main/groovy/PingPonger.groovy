public class PingPonger {

  static ArrayList pingPong(number) {
    def results = []
    for (def i = 1; i <= number; i++) {
      if (i % 15 == 0) {
        results << 'PingPong'
      } else if (i % 3 == 0) {
        results << 'Ping'
      } else if (i % 5 == 0) {
        results << 'Pong'
      } else {
        results << i
      }
    }
    return results
  }
}
