package by.rabenok.task1.reader.impl;

import by.rabenok.task1.exception.ArrayException;
import by.rabenok.task1.reader.FileArrayReader;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;


class FileArrayReaderImplTest {
  FileArrayReader fileArrayReader = new FileArrayReaderImpl();

  @Test
  void shouldReadFile() throws ArrayException {
    //given
    try (MockedStatic<Files> mockedStatic = Mockito.mockStatic(Files.class)) {
      mockedStatic.when(() -> Files.readAllLines(any(Path.class))).thenReturn(any(List.class));
      //when
      fileArrayReader.readFile("non_existent_file.txt");
      //then
      mockedStatic.verify(() -> Files.readAllLines(any(Path.class)));
    }
  }

  @Test
  void shouldThrowArrayException_whenFileNotFound() {
    assertThrows(ArrayException.class, () -> {
      fileArrayReader.readFile("non_existent_file.txt");
    });
  }
}