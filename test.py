import unittest

from calculator import add

class TestSum(unittest.TestCase):
    def test_list_int(self):
        a = 5
        b = 10
        result = add(5,10)
        self.assertEqual(result, 15)

if __name__ == '__main__':
    unittest.main()
