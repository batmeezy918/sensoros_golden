import 'package:flutter/material.dart';

void main() => runApp(const SensorOS());

class SensorOS extends StatelessWidget {
  const SensorOS({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text("SensorOS Golden Base")),
        body: const Center(
          child: Text("Golden Template Running"),
        ),
      ),
    );
  }
}
